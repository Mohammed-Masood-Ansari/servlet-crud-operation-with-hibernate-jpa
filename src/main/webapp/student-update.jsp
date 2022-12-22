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
	
	<% Student student = (Student)request.getAttribute("student");%>

	<form action="updatestudent2" method="get">
		
		Id:<input type="text" name="id" value="<%=student.getStudentId() %>"  readonly="readonly" hidden="true">
		
		Email:<input type="email" name="email" value="<%=student.getStudentEmail()%>" >
		
		Name:<input type="text" name="name" value="<%=student.getStudentName()%>" >
		
		<input type="submit" value="update">
		
		
	</form>
</body>
</html>