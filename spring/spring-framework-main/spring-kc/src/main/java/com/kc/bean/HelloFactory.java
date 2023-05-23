package com.kc.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


/**
 * 工厂Bean
 *
 *普通Bean
 *
 * 区别：
 *  1、Person = 普通Bean,注册的组件对象就是Person对象，类型就是Person
 *  2、工厂Bean 实现了FactoryBean接口的组件，容器注册的不是HelloFactory，而是
 *    HelloFactory这个工厂调用了getObject（）返回的对象，类型是getObjectType指定的类型
 *
 *  使用场景：Mybatis和Spring的整合 SqlSessionFactoryBean
 *
 */

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/7 5:10 下午
 */
@Component //也可以实现 SmartFactoryBean。 指定提前加载
public class HelloFactory  implements FactoryBean <Hello>{

	@Override
	public Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
