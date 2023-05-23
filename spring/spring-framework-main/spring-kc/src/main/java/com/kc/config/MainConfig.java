package com.kc.config;

import com.kc.bean.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/11/19 3:58 下午
 */

/**
 * 这是一个配置类
 */
@Configuration
@ComponentScan("com.kc")
//@Import({Person.class, AppConfig.MyImportRegistrar.class})
@Import({Person.class})
public class MainConfig {


	public MainConfig() {
		System.out.println("MainConfig.......创建了...");
	}


	//	@Bean
//	public Person person(){
//		Person person = new Person();
//		person.setName("李四");
//		return person;
//	}

	/**
	 * BeanDefinitionRegistry  bean定义注册中心  图纸中心
	 *    里面都是BeanDefinition
	 */
//
}
