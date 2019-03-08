<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆界面</title>
</head>
<body>
<div style="width:900px;height:606px;">
<img src="picture/安大.jpg" style="position:relative;left:20%">
</div>

<div style="position:absolute;top:600px;left:300px;height:150px;width:150px">
<form action="${pageContext.request.contextPath}/UserLoginServlet" method="GET">
学号：<input type="text" name="StudentId">
<br/>
密码：<input type="password" name="Password">
<input type="submit" value="登陆">
</form>
</div>

</body>
</html>