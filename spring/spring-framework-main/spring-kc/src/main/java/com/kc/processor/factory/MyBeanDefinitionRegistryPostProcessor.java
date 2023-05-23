package com.kc.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 7:17 下午
 * BeanFactory 的后置处理器
 *
 * , PriorityOrdered, Ordered
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("MyBeanDefinitionRegistryPostProcessor............");
	}


	//先执行
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor....postProcessBeanDefinitionRegistry.....");
		//增强bean定义的注册中心，比如自己注册组件

	}

	//后执行
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("MyBeanDefinitionRegistryPostProcessor....postProcessBeanFactory.....");
	}

//	@Override
//	public int getOrder() {
//		//数字越小优先级越高
//		return 0;
//	}
}
