package com.jsp.Servlet.School.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Servlet.School.Controller.Controller;

@WebServlet(value = "/Updat")
public class Updat extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String password = req.getParameter("pass");
		String mail = req.getParameter("mail");
		String contact = req.getParameter("contact");
		String address = req.getParameter("add");
		String username = req.getParameter("user");
		
		Controller controoller = new Controller();
		PrintWriter printWriter = resp.getWriter();
		if (controoller.updateStudent(name,age,password,mail,contact,address,username,id)) {
			printWriter.print("Update Successfull");
		}else {
			printWriter.print("");
		}
	}
}
