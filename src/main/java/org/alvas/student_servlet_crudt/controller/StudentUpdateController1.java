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

@WebServlet(value = "/updatestudent1")
public class StudentUpdateController1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao dao = new StudentDao();
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		Student student = dao.getStudentById(id);
		
		if(student!=null) {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("update-student1.jsp");
			req.setAttribute("stud",student);
			dispatcher.forward(req, resp);
		}else {
			
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("Student not found with given Id");
		}
	}
}
