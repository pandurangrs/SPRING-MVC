<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h2 class="text-center">${Header }</h2>
		<p class="text-center">${Desc }</p>
		<hr>
<%-- 	<h1>Welcome = ${name }</h1>
	<h2>Email is =  ${email }</h2>
	<h3>Password is = ${password }</h3> --%>
	
	<h1> ${user.userEmail }</h1>
	<h2>${user.userName }</h2>
	<h3>${user.userPassword }</h3>


</body>
</html>