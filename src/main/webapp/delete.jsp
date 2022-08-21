<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="delete" modelAttribute="student">
		<h2>Enter id to delete student</h2>
		<form:label path="id">Id:</form:label>
		<form:input path="id"/> <br> <br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>