package com.kc.test;

import com.kc.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author KCWang
 * @version 1.0
 *   注解版Spring用法
 * @date 2022/11/19 11:49 上午
 */
public class AnnotationMainTest {
	public static void main(String[] args) {
		//初始化Spring  AnnotationConfigApplicationContext本身是个IOC容器
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		System.out.println(applicationContext.getBean(Person.class));

		//获取容器中所有组件
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println(s));


//		Cat bean1 = applicationContext.getBean(Cat.class);
//		Cat bean2 = applicationContext.getBean(Cat.class);
//		System.out.println(		bean1 == bean2);

		/**
		 * 单实例 依赖的组件是多实例子就不能使用 Autowired
		 */
//		Person bean = applicationContext.getBean(Person.class);
//		Cat cat = bean.getCat();
//
//		Person bean1 = applicationContext.getBean(Person.class);
//		Cat cat1 = bean1.getCat();
//
//		System.out.println(cat == cat1);

	}
}
