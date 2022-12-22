package org.alvas.student_servlet_crudt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alvas.student_servlet_crudt.dao.StudentDao;
import org.alvas.student_servlet_crudt.dto.Student;

@WebServlet("/student")
public class StudentController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String studentName = req.getParameter("studentName");
		String studentEmail = req.getParameter("studentEmail");
		
		Student student = new Student();
		
		student.setStudentName(studentName);
		student.setStudentEmail(studentEmail);
		
		StudentDao dao = new StudentDao();
		
		dao.saveStudent(student);
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.write("<html><body><h1 style='text-color:green;'>Data Inserted Successfully</h1></body></html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("registration-student.jsp");
		
		dispatcher.include(req, resp);
	}
	
}
