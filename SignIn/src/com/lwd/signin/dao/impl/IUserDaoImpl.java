package com.lwd.signin.dao.impl;

import java.sql.ResultSet;

import com.lwd.signin.dao.IUserDao;
import com.lwd.signin.db.DBHelper;
import com.lwd.signin.model.UserInfo;


public class IUserDaoImpl implements IUserDao{
	
	DBHelper dbh = new DBHelper();
	String Sql = "";
	ResultSet rs = null;
	
	
	@Override
	public UserInfo save(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo selectByPhoneNum(String phoneNum) throws Exception {
		UserInfo user =null;
		this.Sql = "select * from user where User_tel=?";
		this.rs = this.dbh.execQuery(Sql, phoneNum);
		while (rs.next()) {
			user= new UserInfo();
			user.setUser_id(rs.getInt(1));
			user.setUser_name(rs.getString(2));
			user.setUser_desc(rs.getString(3));
			user.setUser_tel(rs.getString(4));
			user.setUser_sex(rs.getString(5));
			user.setUser_avatar(rs.getString(6));
			user.setUser_nickname(rs.getString(7));
			user.setUser_longitude(rs.getString(8));
			user.setUser_latitude(rs.getString(9));
			user.setUser_statue(rs.getString(10));
			user.setUser_password(rs.getString(11));
		}
		this.dbh.closeAll();
		return user = user == null ? new UserInfo() : user;
	}

	@Override
	public UserInfo selectByPnAndPa(String phoneNum, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo updatePassword(String phoneNum, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo updateUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findByCount(String phonenumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo loginByPhoneNum(String phoneNum, String password) throws Exception {
		UserInfo user =null;
		this.Sql = "select * from user where User_tel=? and User_password=?";
		this.rs = this.dbh.execQuery(Sql, new Object[]{phoneNum,password});
		while (rs.next()) {
			user= new UserInfo();
			user.setUser_id(rs.getInt(1));
			user.setUser_name(rs.getString(2));
			user.setUser_desc(rs.getString(3));
			user.setUser_tel(rs.getString(4));
			user.setUser_sex(rs.getString(5));
			user.setUser_avatar(rs.getString(6));
			user.setUser_nickname(rs.getString(7));
			user.setUser_longitude(rs.getString(8));
			user.setUser_latitude(rs.getString(9));
			user.setUser_statue(rs.getString(10));
			user.setUser_password(rs.getString(11));
		}
		this.dbh.closeAll();
		return user = user == null ? new UserInfo() : user;
	}

}
