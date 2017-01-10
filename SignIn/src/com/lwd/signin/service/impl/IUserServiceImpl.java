package com.lwd.signin.service.impl;

import com.lwd.signin.factory.DaoFactory;
import com.lwd.signin.model.UserInfo;
import com.lwd.signin.service.IUserService;

public class IUserServiceImpl implements IUserService{

	UserInfo user = new UserInfo();
	
	@Override
	public UserInfo selectByPhoneNum(String phoneNum) throws Exception {
		// TODO Auto-generated method stub
		this.user = DaoFactory.getUserDaoInstance().selectByPhoneNum(phoneNum);
		return user=user==null?new UserInfo():user ;
	}

	@Override
	public UserInfo loginByPhoneNum(String phoneNum, String password) throws Exception {
		// TODO Auto-generated method stub
		this.user = DaoFactory.getUserDaoInstance().loginByPhoneNum(phoneNum,password);
		return user=user==null?new UserInfo():user ;
	}

}
