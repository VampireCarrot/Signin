package com.lwd.signin.factory;

import com.lwd.signin.dao.IUserDao;
import com.lwd.signin.dao.impl.IUserDaoImpl;

public class DaoFactory {
	/**
	 * 用户信息Dao工厂
	 * 
	 * @return
	 */
	public static IUserDao getUserDaoInstance() {
		return new IUserDaoImpl();
	}

}
