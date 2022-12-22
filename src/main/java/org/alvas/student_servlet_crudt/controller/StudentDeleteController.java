package org.alvas.student_servlet_crudt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alvas.student_servlet_crudt.dao.StudentDao;

@WebServlet(value = "/deletestudent")
public class StudentDeleteController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao dao = new StudentDao();
		
		dao.deleteStudent(Integer.parseInt(req.getParameter("id")));
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		
		dispatcher.include(req, resp);
	}
	
}
