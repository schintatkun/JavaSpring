<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>
	<h1>Created JSP</h1>
	<%!
		public int add(int a, int b){
		return a+b;
	}
	%>
	<%
		int i =2;
		int j =4;
	%>
	
	<h3><%= add(i, j)%></h3>
	
<%--  	<%for(int ind=0;ind<8;ind++) { %>
		<h1><%=ind%></h1>
	<%} %>
	 --%>
	<p>The time is: <%= new Date() %></p>
	
	<!-- getting the value for the name parameter -->
    <% String req = request.getParameter("name"); %>
    <!-- displaying the value -->
    <h1><%= req %></h1>
	
	
</body>
</html>