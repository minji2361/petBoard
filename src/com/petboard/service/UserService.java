package com.petboard.service;

import org.springframework.stereotype.Service;

import com.petboard.repository.UserDao;

@Service
public class UserService {
	
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
