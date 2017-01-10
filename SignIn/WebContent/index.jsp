<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>EHome</title>
</head>
<body>
	<form  method="post" action="UserLoginServlet">
    <label for="myName">请输入手机号：</label>
    <input type="text" value="" name="User_tel" /></br>
    <label for="myName">请输入密     码：</label>
    <input type="text" value="" name="User_pwd" /></br>
    <input type="submit" value="提交" name="submit" />
</body>
</html>