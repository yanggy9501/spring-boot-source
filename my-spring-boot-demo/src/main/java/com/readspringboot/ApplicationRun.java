package com.readspringboot;

import com.readspringboot.bean.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationRun {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationRun.class, args);

//		MyBean bean = context.getBean(MyBean.class);

//		SpringApplication springApplication = new SpringApplication(ApplicationRun.class);
//		springApplication.xxx
//		springApplication.run(args);
	}

}
