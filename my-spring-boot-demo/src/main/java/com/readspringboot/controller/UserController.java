package com.readspringboot.controller;

import com.readspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String test(){
		return userService.test();
	}
}
