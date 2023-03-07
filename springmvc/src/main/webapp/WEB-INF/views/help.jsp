<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi Pandurang</h1>

	<%
	/* 	String name = (String) request.getAttribute("Name");
		Integer rollNumber = (Integer) request.getAttribute("id");
		Date date = (Date) request.getAttribute("date"); */
	%>

	<h1>
		Name is =
		<%-- <%=name%> --%>
		${Name }


	</h1>
	<h1>
		RollNumber is =
		<%-- <%=rollNumber%> --%>
		${id }

	</h1>

	<h1>
		Todays Date is =
		<%-- <%=date%> --%>
		${date }

	</h1>
	<hr>


	<c:forEach var="item" items="${list }">
		<%-- <h1>${item }</h1> --%>
		<h1>
		<c:out value="${item }"></c:out>
		</h1>
	</c:forEach>




</body>
</html>