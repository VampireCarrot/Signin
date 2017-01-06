package com.lwd.signin.factory;

import com.lwd.signin.service.IUserService;
import com.lwd.signin.service.impl.IUserServiceImpl;

public class ServiceFactory {
	/**
	 * 用户信息业务工厂
	 * 
	 * @return
	 */
	public static IUserService getUserServiceInstance() {
		return new IUserServiceImpl();
	}
}
