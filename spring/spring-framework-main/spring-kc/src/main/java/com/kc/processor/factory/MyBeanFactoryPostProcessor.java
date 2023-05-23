package com.kc.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 7:11 下午
 *
 * BeanFactory 的后置处理器
 *
 * 应用场景：ConfigurationClassPostProcessor->解析配置类
 */
@Component
public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {
	public MyBeanFactoryPostProcessor() {
		System.out.println("MyBeanFactoryPostProcessor..............");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("MyBeanFactoryPostProcessor.......postProcessBeanFactory");

	}
}
