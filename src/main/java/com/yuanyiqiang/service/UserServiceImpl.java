package com.yuanyiqiang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanyiqiang.dao.UserDao;
import com.yuanyiqiang.entity.User;
import com.yuanyiqiang.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	public User getUserById(Integer userId) {
		return userDao.getUserById(userId);
	}
}
