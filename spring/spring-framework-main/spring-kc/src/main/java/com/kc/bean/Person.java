package com.kc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;


/**
 * Aware 接口 帮我们装配Spring底层的组件
 * 1、Bean 的功能增强全部都是由BeanPostProcessor+生命周期(InitializingBean) 这两个接口完成
 *2、骚操作就是 BeanPostProcessor+生命周期(InitializingBean)
 *
 * Person  为什么能把 ApplicationContext当作自己的参数传进来
 *    通过实现接口的方式实现自动注入，是由BeanPostProcessor :Bean的后置处理器完成的
 */

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/4 11:15 上午
 * MessageSourceAware : 国际化工具  aware 装配
 */
//@Component
public class Person implements ApplicationContextAware , MessageSourceAware {

	private String name;

	private ApplicationContext  context;
	private MessageSource messageSource;

	/**
	 *
	 * @Autowired   单实例 依赖的组件是多实例子就不能使用 Autowired
	 */
	private Cat  cat;

	public Person() {
		System.out.println("开始创建Person对象");
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	@Lookup // 去容器中找  lookup methods won't work on beans returned from {@code @Bean} methods in configuration classes;
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//利用回掉机制，把ioc容器传进来
		this.context  = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}


