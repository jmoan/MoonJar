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
	<div align="center">
		<h1>회원가입</h1>
		<form action="/join" method="post" onsubmit="return chechInvalidate();">
			아이디 : <input type="text" id="formValue" name="id" alt="아이디"><input type="button" value="중복체크" onclick="checkDuplicateId();"><span id="checkSpanId"></span><br>
			비밀번호 : <input type="password" id="formValue" name="password" alt="비밀번호"><br>
			비밀번호 확인 : <input type="password" id="formValue" name="passwordRe" alt="비밀번호 확인" onkeyup="checkPasswordRe();"><span id="checkSpanPwd"></span><br>
			이름 : <input type="text" id="formValue" name="name" alt="이름"><br>
			<button>가입하기</button>
			<input type="button" value="취소">
		</form>
	</div>	
</body>
</html>