<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="style.css">
	<title>CheckerBoard</title>
</head>
<body>
	<div class="container">
	
		<%	int width =0; int height = 0;
			String strWidth =""; String strHeight = "";
			if(request.getParameter("width") != null){
				//convert String to a primitive int -> Integer.parseInt(number)
				width = Integer.parseInt(request.getParameter("width"));
				strWidth =request.getParameter("width");
			}
			if(request.getParameter("height")!= null){
				height = Integer.parseInt(request.getParameter("height"));
				strHeight =request.getParameter("height");
			}
		%>
		<h1>CheckerBoard: <%=strWidth%>W X <%=strHeight%>H</h1>
		
		<table>
		<% for(int i=0;i<height;i++){ %>
			<tr>
			<% for(int j=0;j<width;j++){ %>
				<td class="color<%=(i+j)%2+1%>"></td>
			<%}%>
			</tr>
		<%}%>
		</table>
		
	</div>
</body>
</html>