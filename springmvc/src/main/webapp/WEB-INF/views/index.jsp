<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	<h2>Name Is Pandurang</h2>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> ff = (List<String>) request.getAttribute("f");
	%>

	<h1>
		Name is =
		<%=name%></h1>
	<h1>
		Id is =
		<%=id%>
	</h1>


	<%
	for (String s : ff) {
	%>
		
		<h1> <%=s%></h1>
		<%
	}
	%>


</body>
</html>