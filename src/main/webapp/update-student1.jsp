<%@page import="org.alvas.student_servlet_crudt.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to update student Details Page</h1>
	<% Student student=(Student)request.getAttribute("stud"); %>
	
	<form action="updatestudent2" >
	
		<input type="text"  name = "id" value="<%= student.getStudentId() %>" readonly="readonly" >
		<input type="text" name="email" value="<%= student.getStudentEmail()%>">
		<input type="text" name="name" value="<%= student.getStudentName()%>">
		<input type="submit" value="update">
		
	</form>
</body>
</html>