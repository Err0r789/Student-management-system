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

@WebServlet(value = "/Find_Student")
public class Find_Student extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("UserName");
		
		Controller controller = new Controller();
		PrintWriter printWriter = resp.getWriter();
		
		int id_int = Integer.parseInt(id);
		Student student_data = controller.find_student_by_id(id_int);
		
		String gender;
		if (student_data.isStudent_gender()) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		
		
		if (student_data != null) {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <title>Student Details</title>\r\n"
					+ "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">    \r\n"
					+ "    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\">\r\n"
					+ "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n"
					+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
					+ "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <div class=\"container\">\r\n"
					+ "        <div class=\"row my-3  bg-light p-4 border rounded\">\r\n"
					+ "            <div class=\"col-12\">\r\n"
					+ "                <div class=\"h3 font-weight-normal\">\r\n"
					+ "                    Welcome "+student_data.getStudent_name()+"\r\n"
					+ "                    <div class=\"lead\">\r\n"
					+ "                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-backpack-fill\" viewBox=\"0 0 16 16\" >\r\n"
					+ "                            <path d=\"M5 13v-3h4v.5a.5.5 0 0 0 1 0V10h1v3z\"/>\r\n"
					+ "                            <path d=\"M6 2v.341C3.67 3.165 2 5.388 2 8v5.5A2.5 2.5 0 0 0 4.5 16h7a2.5 2.5 0 0 0 2.5-2.5V8a6 6 0 0 0-4-5.659V2a2 2 0 1 0-4 0m2-1a1 1 0 0 1 1 1v.083a6 6 0 0 0-2 0V2a1 1 0 0 1 1-1m0 3a4 4 0 0 1 3.96 3.43.5.5 0 1 1-.99.14 3 3 0 0 0-5.94 0 .5.5 0 1 1-.99-.14A4 4 0 0 1 8 4M4.5 9h7a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5\"/>\r\n"
					+ "                        </svg>\r\n"
					+ "                        Student\r\n"
					+ "                    </div>\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "        </div>\r\n"
					+ "    </div>\r\n"
					+ "    <form action=\"Updat\" method=\"post\">\r\n"
					+ "        <div class=\"container\">\r\n"
					+ "        <div class=\"row bg-light font-weight-normal p-4 pb-5 border rounded\">\r\n"
					+ "            <div class=\"col-12 mb-3\">\r\n"
					+ "                <div class=\"h3 text-center text-dark m-4 font-weight-normal\">\r\n"
					+ "                    <i class=\"far fa-clone pr-1 h5\"></i>\r\n"
					+ "                    General Information\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"id\">Student ID :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"\" name=\"id\" value=\""+student_data.getId()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"name\">Student Name :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"naam\" name=\"name\" value=\""+student_data.getStudent_name()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"age\">Student Age :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"age\" name=\"age\" value=\""+student_data.getStudent_age()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"gender\">Student Gender :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"gen\" name=\"gender\" value=\""+gender+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"mail\">Student Gmail :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"mail\" name=\"mail\" value=\""+student_data.getStudent_gamil()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"contact\">Student Contact :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"contact\" name=\"contact\" value=\""+student_data.getStudent_contact()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"add\">Student Address :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"address\" name=\"add\" value=\""+student_data.getStudent_address()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"user\">Student UserName :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"user\" name=\"user\" value=\""+student_data.getStudent_user()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "            <div class=\"col-6 col-md-4 my-2\">\r\n"
					+ "                <label for=\"pass\">Student Password :</label><br>\r\n"
					+ "                <input type=\"text\" id=\"pass\" name=\"pass\" value=\""+student_data.getStudent_pass()+"\" readonly>\r\n"
					+ "            </div>\r\n"
					+ "<div class=\"col-12 my-4 text-right mt-5\">\r\n"
					+ "                <a onclick=\"myFunction()\" class=\"btn btn-info px-3\">\r\n"
					+ "                    <i class=\"bi bi-pencil-square\"></i>\r\n"
					+ "                    Edit \r\n"
					+ "                </a>\r\n"
					+ "                <div class=\"btn btn-info\">\r\n"
					+ "                    <i class=\"bi bi-download\"></i>\r\n"
					+ "                    <input type=\"submit\" value=\"Save\" style=\"border: none;background-color: transparent;\">\r\n"
					+ "                </div>\r\n"
					+ "                <div class=\"btn btn-danger\">\r\n"
					+ "                    <i class=\"bi bi-trash3-fill\"></i>\r\n"
					+ "                    <a href=\"Delete?name="+student_data.getId()+" \">Delete</a>\r\n"
					+ "                </div>"
					+ "            </div>"
					+ "        </div>\r\n"
					+ "        </div>\r\n"
					+ "    </form>\r\n"
					+ "<script>\r\n"
					+ "        function myFunction() {\r\n"
					+ "            var name = document.getElementById(\"naam\");\r\n"
					+ "            var age = document.getElementById(\"age\");\r\n"
					+ "            var address = document.getElementById(\"address\");\r\n"
					+ "            var user = document.getElementById(\"user\");\r\n"
					+ "            var pass = document.getElementById(\"pass\");\r\n"
					+ "            var mail = document.getElementById(\"mail\");\r\n"
					+ "\r\n"
					+ "            name.removeAttribute(\"readonly\");\r\n"
					+ "            age.removeAttribute(\"readonly\");\r\n"
					+ "            address.removeAttribute(\"readonly\");\r\n"
					+ "            user.removeAttribute(\"readonly\");\r\n"
					+ "            pass.removeAttribute(\"readonly\");\r\n"
					+ "            mail.removeAttribute(\"readonly\");\r\n"
					+ "        }\r\n"
					+ "    </script>"
					+ "</body>\r\n"
					+ "</html>");
		} else {
			printWriter.print("Student Not Found");
		}
		
		
		
	}
}
