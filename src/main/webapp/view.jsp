<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.age}</td>
			<td>${student.email}</td>
			<td>${student.password}</td>
		</tr>
	</table>
</body>
</html>