package com.yuanyiqiang.dao;

import com.yuanyiqiang.entity.User;

/**
 * @描述: User的DAO类
 * @author Jesse
 * @since 2017-01-22 21:10:05
 */
public interface UserDao {

	/**
	 * @author Jesse
	 * @since 2017-01-22 21:09:08
	 * @param userId
	 * @return
	 */
	public User getUserById(Integer userId);
}
