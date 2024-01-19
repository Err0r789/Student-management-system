package com.jsp.Servlet.School.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Servlet.School.Controller.Controller;

@WebServlet(value = "/AddStudent")
public class AddStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String gmail = req.getParameter("mail");
		String contact = req.getParameter("contact");
		String address = req.getParameter("add");
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		
		
		PrintWriter printWriter = resp.getWriter();
		Controller controller = new Controller();
		
		if (controller.add_student(name,age,gender,gmail,contact,address,username,password)) {
			
			printWriter.print("Student Added to Database");
		} else {
			printWriter.print("Nope!!!!!");
		}
	}
}
