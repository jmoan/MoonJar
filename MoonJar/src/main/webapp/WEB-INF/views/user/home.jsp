<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="/resources/icon/favicon.ico" type="image/x-icon">
<script type="text/javascript" src="/resources/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/resources/js/common.js"></script>
<title>Home</title>
</head>
<body>
	<c:if test="${user == null }">
	<form action="/login" method="post">
		id : <input type="text" name="id"><br>
		pw : <input type="password" name="password"><br>				
		<button>로그인</button>
		<input type="button" value="가입하기" onclick="javascript:location.href='/joinForm'">
	</form>
	</c:if>
	<c:if test="${user != null }">
		${user.name } 님 어서오세요 ^^
	</c:if>
</body>
</html>