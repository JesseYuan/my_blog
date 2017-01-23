package com.yuanyiqiang.service;

import org.springframework.stereotype.Service;

import com.yuanyiqiang.entity.User;

/**
 * @描述: UserServicec接口类
 * @author Jesse
 *
 */
@Service
public interface UserService {

	User getUserById(Integer userId);
}
