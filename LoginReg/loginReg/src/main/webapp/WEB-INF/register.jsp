<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">	
		<script src="/js/main.js"></script>
	</head>

	<body>
		<form method="post" action="/login">
			<input type="text" name="email">Email:
			<input type="password" name="password"> Password:
			<input type="submit" value="login!">
		</form>

	<form:form action="/register" method="post" modelAttribute="user">
		<form:label path="email">Email:
			<form:errors path="email" ></form:errors>
			<form:input path="email"></form:input>
		</form:label>
		<form:label path="firstName">First Name:
			<form:errors path="firstName" ></form:errors>
			<form:input path="firstName"></form:input>
		</form:label>
		<form:label path="lastName">Last Name:
			<form:errors path="lastName" ></form:errors>
			<form:input path="lastName"></form:input>
		</form:label>
		<form:label path="password">Password:
			<form:errors path="password" ></form:errors>
			<form:input path="password" type="password"></form:input>
		</form:label>
		<form:label path="confirm">Confirm Password:
			<form:errors path="confirm"></form:errors>
			<form:input path="confirm"></form:input>
		</form:label>
	<input type="submit" value="Register!"/>
	</form:form>


	</body>
</html>