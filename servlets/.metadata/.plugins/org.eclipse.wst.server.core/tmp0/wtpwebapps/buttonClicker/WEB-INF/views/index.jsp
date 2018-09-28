<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<form action="/buttonClick/counter" method="post">
		<input type="submit" name="click" value="Click Me!">
	</form>
	<h1>You have clicked this button <c:out value="${countNum}"/> times</h1>
</body>
</html>