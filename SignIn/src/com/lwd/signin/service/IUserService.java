package com.lwd.signin.service;

import com.lwd.signin.model.UserInfo;

public interface IUserService {
	/**
	 * 根据手机号查找用户
	 * @param phoneNum
	 * @return
	 * @throws Exception
	 */
	public UserInfo selectByPhoneNum(String phoneNum) throws Exception;
}
