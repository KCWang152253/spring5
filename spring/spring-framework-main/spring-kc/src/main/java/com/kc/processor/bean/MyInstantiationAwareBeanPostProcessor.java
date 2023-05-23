package com.kc.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 8:47 下午
 *
 * bean实例化前后
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("MyInstantiationAwareBeanPostProcessor.......InstantiationAwareBeanPostProcessor.");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.......postProcessBeforeInstantiation.");
		//如果我们自己创建了对象返回。Spring 不会帮我们创建对象
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.......postProcessAfterInstantiation......");
		//返回false,则bean的赋值全部结束
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.......postProcessProperties......");
		return null;
	}
}
