<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 로그인</title>
<%
		String message = (String)request.getAttribute("message");
	%>
</head>
<body>
<h3>학생 로그인</h3>
	<form action="/student/login" method = "post">
	ID : <input type = "text" name = "userId"><br>
	PW : <input type = "password" name = "userPw"><br>
	<input type = "submit" value = "로그인">
	</form>
</body>
</html>