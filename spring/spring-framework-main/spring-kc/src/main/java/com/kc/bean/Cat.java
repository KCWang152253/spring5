package com.kc.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/4 9:29 下午
 */

@Component
@Scope(scopeName = SCOPE_PROTOTYPE)
//容器应该给 cat 再创建一个实例
public class Cat implements InitializingBean , SmartInitializingSingleton {

	public Cat() {
		System.out.println("cat.......被创建了..");
	}

	private String name;

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}") //自动赋值功能
	public void setName(String name) {
		System.out.println("cat.....setName正在赋值调用...");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CatInitializingBean......................InitializingBean.....");
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("所有组件都创建完成以后，再来执行这个方法");
	}
}
