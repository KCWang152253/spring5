package com.kc.processor.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/12/8 9:11 下午
 *
 * 生命周期接口
 */
@Component
public class MyInitializingBean  implements InitializingBean {

	public MyInitializingBean() {
		System.out.println("MyInitializingBean........InitializingBean.....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//可以在当前组件的所有属性全部就绪后继续进行增强  比如说连接池 在所有东西都准备好了之后才创建连接池
		System.out.println("MyInitializingBean.........afterPropertiesSet.......");
	}
}
