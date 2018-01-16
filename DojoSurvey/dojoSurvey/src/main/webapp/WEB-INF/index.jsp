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
		<form method="POST" action="/login">
			<label>Username: <input type="text" name="username"></label>
			<label>Password: <input type="password" name="password"></label>
			<label>Dojo Location</label><select name = "location">  
				<option value="DC">DC</option>
				<option value="LA">LA</option>
				<option value="NYC">NYC</option>
				<option value="SF">SF</option>
			</select>
			<label>Favorite Language</label><select name = "language"> 
				<option value="JavaScript">JavaScript</option>
				<option value="Python">Python</option>
				<option value="Java">Java</option>
				<option value="iOS">iOS</option>
			</select>
			<button>Login</button>
		</form>
	</body>
</html>