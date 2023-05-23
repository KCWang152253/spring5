package com.kc.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 8:52 下午
 *
 * 允许 MergedBeanDefinitionPostProcessor再来修改一下BeanDefinition
 */
@Component
public class MyMergedBeanDefinitionPostProcessor  implements MergedBeanDefinitionPostProcessor {

	public MyMergedBeanDefinitionPostProcessor() {
		System.out.println("MyMergedBeanDefinitionPostProcessor.........MergedBeanDefinitionPostProcessor.......");
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor.........postProcessMergedBeanDefinition.......");
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor.........resetBeanDefinition.......");

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyMergedBeanDefinitionPostProcessor.........postProcessBeforeInitialization.......");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyMergedBeanDefinitionPostProcessor.........postProcessAfterInitialization.......");
		return null;
	}

}
