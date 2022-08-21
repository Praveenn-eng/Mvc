<%@page import="com.ty.student.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form>
		<table>
		  <tr>
		    <th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Password</th>
		  </tr>
		  <tr>
		    <%for(Student student : ${students} ){ %>
		    	<td>${student.id }</td>
		    	<td>${student.name }</td>
		    	<td>${student.age }</td>
		    	<td>${student.email }</td>
		    	<td>${student.password }</td>
		    <%} %>
		  </tr>
		</table>
	</form:form>
</body>
</html>