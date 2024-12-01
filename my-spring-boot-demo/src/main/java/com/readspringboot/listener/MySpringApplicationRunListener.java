package com.readspringboot.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

// 监听SpringBoot的启动流程
public class MySpringApplicationRunListener implements SpringApplicationRunListener {
	/**
	 * 当调用run方法后会立即调用，可以用于非常早期的初始化
	 */
	public void starting(ConfigurableBootstrapContext bootstrapContext) {

	}

	/**
	 * 环境准备好之后调用
	 */
	public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext,
			ConfigurableEnvironment environment) {

	}

	/**
	 * 在加载资源之前，ApplicationContex准备好之后调用
	 */
	public void contextPrepared(ConfigurableApplicationContext context) {

	}

	/**
	 * 在加载应用程序上下文但在其刷新之前调用
	 */
	public void contextLoaded(ConfigurableApplicationContext context) {
	}

	/**
	 * 上下文已经刷新且应用程序已启动且所有{@link CommandLineRunner commandLineRunner}
	 * 和{@link ApplicationRunner ApplicationRunners}未调用之前调用
	 */
	public void started(ConfigurableApplicationContext context) {

	}

	/**
	 * 当应用程序上下文被刷新并且所有{@link CommandLineRunner commandLineRunner}
	 * 和{@link ApplicationRunner ApplicationRunners}都已被调用时，在run方法结束之前立即调用。
	 */
	public void running(ConfigurableApplicationContext context) {

	}

	/**
	 * 在启动过程发生失败时调用
	 */
	public void failed(ConfigurableApplicationContext context, Throwable exception) {
		
	}
}
