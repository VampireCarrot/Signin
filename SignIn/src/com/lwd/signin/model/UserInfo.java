package com.lwd.signin.model;

import java.io.Serializable;

/**
 * UserInfo 用户信息表
 * @author SignIn
 *
 */
public class UserInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8415093367223065321L;
	
	private int User_id;
	private String User_name;
	private String User_desc;
	private String User_tel;
	private String User_sex;
	private String User_avatar;
	private String User_nickname;
	private String User_longitude;
	private String User_latitude;
	private String User_statue;
	private String User_password;
	
	
	public UserInfo() {
		super();
	}


	
	public UserInfo(int user_id, String user_name, String user_desc, String user_tel, String user_sex,
			String user_avatar, String user_nickname, String user_longitude, String user_latitude, String user_statue,
			String user_password) {
		super();
		User_id = user_id;
		User_name = user_name;
		User_desc = user_desc;
		User_tel = user_tel;
		User_sex = user_sex;
		User_avatar = user_avatar;
		User_nickname = user_nickname;
		User_longitude = user_longitude;
		User_latitude = user_latitude;
		User_statue = user_statue;
		User_password = user_password;
	}



	public int getUser_id() {
		return User_id;
	}


	public void setUser_id(int user_id) {
		User_id = user_id;
	}


	public String getUser_name() {
		return User_name;
	}


	public void setUser_name(String user_name) {
		User_name = user_name;
	}


	public String getUser_desc() {
		return User_desc;
	}


	public void setUser_desc(String user_desc) {
		User_desc = user_desc;
	}


	public String getUser_tel() {
		return User_tel;
	}


	public void setUser_tel(String user_tel) {
		User_tel = user_tel;
	}


	public String getUser_sex() {
		return User_sex;
	}


	public void setUser_sex(String user_sex) {
		User_sex = user_sex;
	}


	public String getUser_avatar() {
		return User_avatar;
	}


	public void setUser_avatar(String user_avatar) {
		User_avatar = user_avatar;
	}


	public String getUser_nickname() {
		return User_nickname;
	}


	public void setUser_nickname(String user_nickname) {
		User_nickname = user_nickname;
	}


	public String getUser_longitude() {
		return User_longitude;
	}


	public void setUser_longitude(String user_longitude) {
		User_longitude = user_longitude;
	}


	public String getUser_latitude() {
		return User_latitude;
	}


	public void setUser_latitude(String user_latitude) {
		User_latitude = user_latitude;
	}


	public String getUser_statue() {
		return User_statue;
	}


	public void setUser_statue(String user_statue) {
		User_statue = user_statue;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getUser_password() {
		return User_password;
	}



	public void setUser_password(String user_password) {
		User_password = user_password;
	}



	@Override
	public String toString() {
		return "UserInfo [User_id=" + User_id + ", User_name=" + User_name + ", User_desc=" + User_desc + ", User_tel="
				+ User_tel + ", User_sex=" + User_sex + ", User_avatar=" + User_avatar + ", User_nickname="
				+ User_nickname + ", User_longitude=" + User_longitude + ", User_latitude=" + User_latitude
				+ ", User_statue=" + User_statue + ", User_password=" + User_password + "]";
	}
	
	
	
	
}
