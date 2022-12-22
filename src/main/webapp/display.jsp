
<%@page import="org.alvas.student_servlet_crudt.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="org.alvas.student_servlet_crudt.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			StudentDao dao = new StudentDao();
				
			List<Student> students = dao.getAllStudent();
		%>
		
		<table border='2'>
		
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<%for(Student student: students ){ %>
			
			<tr>
				<td><%= student.getStudentId()%></td>
				<td><%= student.getStudentName() %></td>
				<td><%= student.getStudentEmail() %></td>
				<td><a href="deletestudent?id=<%= student.getStudentId()%>"><button style="background-color:red">Delete</button></a></td>
				<td><a href="updatestudent1?id=<%= student.getStudentId()%>"><button style="background-color:yellow">Update</button></a></td>
			</tr>
			
			<%} %>
			
		</table>
</body>
</html>