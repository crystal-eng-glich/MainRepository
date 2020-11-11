package com.yuxiu.edu.service;

import com.yuxiu.edu.service.base.IBaseService;
import com.yuxiu.entity.User;

public interface IUserService extends IBaseService<User> {
	public User login(String username,String password);

}
