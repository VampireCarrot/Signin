package com.lwd.signin.dao;

import com.lwd.signin.model.UserInfo;

public interface IUserDao {
	
	/**
	 * 保存用户对象
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public UserInfo save(UserInfo user) throws Exception;

	/**
	 * 根据手机号查询
	 * @param phoneNum
	 * @return
	 * @throws Exception
	 */
	public UserInfo selectByPhoneNum(String phoneNum) throws Exception;
	/**
	 * 根据用户名和密码查询用户
	 * @param phonenumber
	 * @return
	 * @throws Exception
	 */
	public UserInfo selectByPnAndPa(String phoneNum, String password) throws Exception;

	/**
	 * 修改密码
	 * @param phonenumber
	 * @return
	 * @throws Exception
	 */
	public UserInfo updatePassword(String phoneNum, String password) throws Exception;

	/**
	 * 修改用户信息
	 * @param phonenumber
	 * @return
	 * @throws Exception
	 */
	public UserInfo updateUserInfo(UserInfo user) throws Exception;
	
	/**
	 * 查找用户是否存在
	 * @param phonenumber
	 * @return
	 * @throws Exception
	 */
	public Integer findByCount(String phonenumber)throws Exception;
	

}
