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

@WebServlet("/updatestudent2")
public class UpdateStudentController2 extends HttpServlet  {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Student student = new Student();
		
		student.setStudentId(Integer.parseInt(req.getParameter("id")));
		student.setStudentEmail(req.getParameter("email"));
		student.setStudentName(req.getParameter("name"));
		
		StudentDao dao = new StudentDao();
		
		dao.updateStudentById(student, student.getStudentId());
		
		if(student!=null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.include(req, resp);
		}else {
			PrintWriter printWriter = resp.getWriter();
			
			printWriter.print("Student not found");
		}
	}
}
