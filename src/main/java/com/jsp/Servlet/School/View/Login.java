package com.jsp.Servlet.School.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Servlet.School.Controller.Controller;
import com.jsp.Servlet.School.Model.Admin;
import com.jsp.Servlet.School.Model.Student;

@WebServlet(value = "/Login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Controller controller = new Controller();
		PrintWriter printWriter = resp.getWriter();
		
		
		if (controller.admin_login(username) != null) {
			Admin admin = controller.admin_login(username);
			req.setAttribute("admin_name", admin.getAdmin_name());
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Admin_Details");
			requestDispatcher.forward(req, resp);
			//printWriter.print("admin u r in !!!");
		} else if (controller.student_login(username) != null){
			Student student = controller.student_login(username);
			req.setAttribute("id", student.getId());
			req.setAttribute("user", student.getStudent_user());
			req.setAttribute("name", student.getStudent_name());
			req.setAttribute("pass", student.getStudent_pass());
			req.setAttribute("age", student.getStudent_age());
			req.setAttribute("contact", student.getStudent_contact());
			req.setAttribute("mail", student.getStudent_gamil());
			req.setAttribute("address", student.getStudent_address());
			
			if (student.isStudent_gender()) {
				req.setAttribute("gender", "Mail");
			} else {
				req.setAttribute("gender", "Femail");
			}
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Student_Details");
			requestDispatcher.forward(req, resp);
		} else {
			printWriter.print("u r out  !!!!!!!!!!");
		}
	}
}
