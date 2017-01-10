package com.lwd.signin.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBHelper {
	// 声明连接对象
		private Connection con;

		// 构造方法
		public DBHelper() {
			// 初始化名称查找上下文
			Context ctxt;
			try {
				ctxt = new InitialContext();
				DataSource datas = (DataSource) ctxt.lookup("java:comp/env/jdbc/SignIn");
				;
				this.con = datas.getConnection();
			} catch (NamingException ne) {
				ne.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		// 执行查询的方法
		public ResultSet execQuery(final String sql) {
			try {
				Statement stm = con.createStatement(); // 获取执行对象
				return stm.executeQuery(sql); // 执行并返回结果集
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		// 执行增删改的方法
		public int execOthers(final String sql) {
			try {
				Statement stm = con.createStatement();
				return stm.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return -1;
		}

		// 执行查询方法（预处理的，支持sql中包含问号）
		public ResultSet execQuery(final String sql, final Object... params) {
			// Object[] params 对于1.5一下的JDK版本
			try {
				PreparedStatement pstm = con.prepareStatement(sql); // 获取预处理对象
				// 通过循环替换SQL命令中的问号
				for (int i = 0; i < params.length; i++) {
					pstm.setObject(i + 1, params[i]);
				}
				return pstm.executeQuery(); // 执行查询并返回结果
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		// 执行增删改（预处理的，支持sql中包含问号）
		public int execOthers(final String sql, final Object... params) {
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					pstm.setObject(i + 1, params[i]);
				}
				return pstm.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return -1;
		}

		// 关闭方法
		public void closeAll() {
			try {
				if (this.con != null && !this.con.isClosed()) {
					try {
						this.con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
