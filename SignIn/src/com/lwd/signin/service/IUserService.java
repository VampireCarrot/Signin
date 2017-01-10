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
	/**
	 * 根据手机号码登陆
	 * @param phoneNum
	 * @return
	 * @throws Exception
	 */
	public UserInfo loginByPhoneNum(String phoneNum,String password) throws Exception;
	
}
