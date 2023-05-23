package com.kc.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 7:13 下午
 * Bean 组件的PostProcessor
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor......");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//可以改变之前创建的bean实例  又一次机会去返回指定的bean  new Object()
		System.out.println("MyBeanPostProcessor.......postProcessBeforeInitialization.");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor......postProcessAfterInitialization.");
		//可以改变之后创建的bean实例  又一次机会去返回指定的bean  new Object()
		return bean;
	}
}
