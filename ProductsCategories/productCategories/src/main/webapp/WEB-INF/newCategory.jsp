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
    <h1>Category</h1>
    <form action="addCategory" method = "post">
        <label>Name:</label>
        <input type= "text" name ="name">
        <input type= "submit" value="Add!">
    </form>

    <br>
    <br>
    <br>

        <table border=1pt>
            <tr>
                <th>Name:</th>
            </tr>
            <tr>
            <c:forEach items="${categories}" var="category">            
                <td>${category.name}</td>
            </tr>
            </c:forEach>   
        </table>
    
    <br>
    <br>
    <br>
    <a href="/newProduct">Add Product</a>
</body>
</html>