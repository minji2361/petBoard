package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
}
