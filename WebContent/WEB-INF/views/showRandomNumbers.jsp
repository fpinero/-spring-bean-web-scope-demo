<%@page import="com.fpe.springdemo.service.RandomizerSessionScope"%>
<%@page import="com.fpe.springdemo.service.RandomizerRequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Random Numbers Scopes</title>
</head>
	<body>
		<p>
			*****************Request Scope************************* <br /> Old
			number:
			<c:out value="${requestRandomNumber}"></c:out>
			<br /> New number:
			<c:out value="${requestRandomNumber2 }"></c:out>
			<br /> Object Reference:
			<c:out value="${requestReferenceId }"></c:out>
		</p>
	
		<p>
			*****************Session Scope************************* <br /> Old
			number:
			<c:out value="${sessionRandomNumber}"></c:out>
			<br /> New number:
			<c:out value="${sessionRandomNumber2 }"></c:out>
			<br /> Object Reference:
			<c:out value="${sessionReferenceId }"></c:out>
		</p>
	
	
	</body>
</html>