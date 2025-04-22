package com.kc.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 8:53 下午
 *
 *  Spring 源码核心组件接口    bean进行代理增强期间进行使用   循环依赖时 先生成 aop 动态代理对象
 *
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......SmartInstantiationAwareBeanPostProcessor.......");
	}


	/**
	 * 预测bean的类型，最后一次改变组件类型
	 */
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......predictBeanType.......");
		return null;
	}

	@Override
	public Class<?> determineBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......determineBeanType.......");
		return null;
	}



	/**
	 * 返回我们要使用的构造器候选列表
	 */
	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......determineCandidateConstructors.......");
		// 返回一个我们指定的构造器
		return null;
	}


	/**
	 * 返回早期的bean引用
	 */
	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......getEarlyBeanReference.......");
		//定义三级缓存的bean信息
		return null;
	}

	/**
	 * 初始化之前进行后置处理，Spring留给我们给这个组件创建对象的回调
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......postProcessBeforeInstantiation.......");
		//如果我们自己创建了对象返回，Spring不会帮我们创建对象，用我们自己创建的对象；我们创建的这个对象会保存单实例吗？ 还是每次getBean都调到我们这里 创建一个新的
		return null;
	}

	/**
	 * 初始化之后进行后置处理
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		//提前改变一些Spring不管的bean里面的属性
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......postProcessAfterInstantiation.....=>."+beanName+"----"+bean );
		//返回 false 则Bean的赋值全部结束
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		//可以用这个方法解析自定义注解，进行属性值注入，pvs封装了所有的属性信息。
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......postProcessProperties.......");
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......postProcessBeforeInitialization.......");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......postProcessAfterInitialization.......");
		return null;
	}
}
