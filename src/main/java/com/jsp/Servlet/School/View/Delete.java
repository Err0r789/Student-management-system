package com.jsp.Servlet.School.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Servlet.School.Controller.Controller;
import com.jsp.Servlet.School.Model.Student;

@WebServlet(value = "/Delete")
public class Delete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("UserName");

		Controller controller = new Controller();
		PrintWriter printWriter = resp.getWriter();

		int id_int = Integer.parseInt(id);
		boolean deleteStudent = controller.deleteStudent(id_int);

		if (deleteStudent) {

			printWriter.print("Student Deleted to Database");
		} else {
			printWriter.print("Failed to Delete");
		}
	}
}
