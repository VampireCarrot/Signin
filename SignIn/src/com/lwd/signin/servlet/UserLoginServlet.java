package com.lwd.signin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.lwd.signin.factory.ServiceFactory;
import com.lwd.signin.model.UserInfo;


public class UserLoginServlet extends HttpServlet{

		private static final long serialVersionUID = 1L;

		// 声明日志
		private static Logger mLogger = LogManager.getLogger(UserLoginServlet.class);

		// 日志消息
		private String msg;

		// 声明并实例化User对象
		UserInfo user = new UserInfo();
		UserInfo resultUser = new UserInfo();

		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public UserLoginServlet() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doPost(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub

			// 声明输出对象
			PrintWriter out = response.getWriter();

			// 提取表单数据
			String User_tel = request.getParameter("User_tel");


			// 调用ServiceFactory
			try {
				resultUser = ServiceFactory.getUserServiceInstance().selectByPhoneNum(User_tel);
				if (resultUser != null) {
					msg = "result: login succeed by phoneNum and password!";
				} else {
					msg = "result: login failed by phoneNum and password for null!";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				msg = "result: login failed by phoneNum and password for " + e.getClass();
			} finally {
				mLogger.info(msg);
			}

			// 把结果转成json字符串
			Gson gson = new Gson();
			String gstr = gson.toJson(resultUser);

			// 返回给移动端
			out.print(gstr);
			out.flush();
			out.close();
		}
}
