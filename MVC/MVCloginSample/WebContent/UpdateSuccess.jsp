<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	签到成功！<br/>
	您已经签到成功
	<% int times = (int)session.getAttribute("trainingTimes"); %>
	<%= times %>
	次！
	<a href = "welcome.jsp">点我返回首页</a>
</body>
</html>