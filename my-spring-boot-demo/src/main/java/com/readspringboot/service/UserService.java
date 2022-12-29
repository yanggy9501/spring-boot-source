package com.readspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Value("${random.int}")
	private int num;

	@Autowired
	private Environment environment;

	public String test(){
		return String.valueOf(environment.getProperty("random.int,100"));
	}
}
