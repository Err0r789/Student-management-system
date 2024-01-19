package com.jsp.Servlet.School.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/NextServlet")
public class NextServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Object nameO = req.getAttribute("username");
		String name = (String)nameO;
		
		Object passO = req.getAttribute("password");
		String pass = (String) passO;
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		
	}
}
