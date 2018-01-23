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
    <h1><c:out value="${product.name}"/></h1>
    <br>
    <form action="/join/${product.id}" method="post">
    <select name="category">
        <c:forEach items="${categoriesAll}" var="catAll">
        <option value="${catAll.id}">
           ${catAll.name} 
        </option>
    </c:forEach>
    </select>
        <input type="submit" value="submit">
    </form>    

    <c:forEach items="${product.getCategory()}" var="categories">
        <p>${categories.name}</p> 
    </c:forEach>

</body>
</html>