<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录页面</title>
	<meta name="content-type" content="text/html; charset=UTF-8">
  </head>
  
  <body>
  	请登录
    <form action="login.action" method="get">
    	用户:<input type="text" name="user.username" value="${user.username}"><br>
    	<input type="submit" value="登录">
    </form>
  </body>
</html>
