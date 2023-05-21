package com.readspringboot.onconditonbean;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanggy
 */
@Configuration
@EnableAutoConfiguration
public class OnConditionConfig {

	@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
	@ConditionalOnClass(MyOnConditionBean.class)
	@ConditionalOnBean(name = "myOnConditionBean")
	@Bean
	public MyOnConditionBean myOnConditionBean() {
		return new MyOnConditionBean();
	}
}
