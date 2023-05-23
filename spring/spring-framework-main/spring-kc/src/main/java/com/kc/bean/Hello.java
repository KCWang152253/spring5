package com.kc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/7 5:18 下午
 */
public class Hello {

	@Autowired  //为啥能进来，之前就保存到容器的实例缓存池了；底层组件先在 resolvableDependencies
	private ApplicationContext applicationContext;


	@Autowired //beanFactory单例池中有
	private Environment environment;

	@Autowired //注入环境变量信息
	private Map<String,String> systemEnvironment;
}
