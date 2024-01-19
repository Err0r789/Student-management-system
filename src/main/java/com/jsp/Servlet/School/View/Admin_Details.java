package com.jsp.Servlet.School.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Admin_Details")
public class Admin_Details extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = (String) req.getAttribute("admin_name");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>Admin page</title>\r\n"
				+ "        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">    \r\n"
				+ "        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\">\r\n"
				+ "    \r\n"
				+ "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n"
				+ "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
				+ "        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n"
				+ "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n"
				+ "\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <div class=\"container\">\r\n"
				+ "            <div class=\"row my-4  bg-light p-4 border rounded\">\r\n"
				+ "                <div class=\"col-12\">\r\n"
				+ "                    <div class=\"h3 font-weight-normal\">\r\n"
				+ "                        "+name+"\r\n"
				+ "                        <div class=\"lead\">\r\n"
				+ "                            <i class=\"bi bi-mortarboard-fill\"></i>\r\n"
				+ "                            Admin\r\n"
				+ "                        </div>\r\n"
				+ "                    </div>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"d-flex flex-column my-2\">\r\n"
				+ "            <div class=\"text-center m-2\">\r\n"
				+ "                <form action=\"Add_student.html\" method=\"post\">\r\n"
				+ "                    <div class=\"btn btn-warning w-25\">\r\n"
				+ "                    <i class=\"bi-person-fill-add\"></i>\r\n"
				+ "                    <input type=\"submit\" value=\"Add Student\" style=\"border: 0cm;background-color: transparent;\">\r\n"
				+ "                    </div>\r\n"
				+ "                </form>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"text-center m-2\" >\r\n"
				+ "                <div class=\"btn btn-warning w-25\">\r\n"
				+ "                    <a onclick=\"myFunction()\">\r\n"
				+ "                        <i class=\"bi bi-search\"></i>\r\n"
				+ "                        Find Student\r\n"
				+ "                    </a>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"text-center my-2\" id=\"inp\" style=\"visibility: hidden;\">\r\n"
				+ "                <form action=\"Find_Student\" method=\"post\">\r\n"
				+ "                    <input type=\"text\" name=\"UserName\" class=\"w-25\" placeholder=\"Enter ID\">\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"text-center m-2\" id=\"btn\" style=\"visibility: hidden;\">\r\n"
				+ "                <div class=\"btn btn-info w-25\">\r\n"
				+ "                    <input type=\"submit\" value=\"Search\" style=\"border: 0cm;background-color: transparent;\">\r\n"
				+ "                </div>\r\n"
				+ "                </form>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <script>\r\n"
				+ "            function myFunction() {\r\n"
				+ "                var inp = document.getElementById(\"inp\");\r\n"
				+ "                var btn = document.getElementById(\"btn\");\r\n"
				+ "\r\n"
				+ "                if (inp.style.visibility === \"hidden\" && btn.style.visibility === \"hidden\") {\r\n"
				+ "                    inp.style.visibility = \"visible\";\r\n"
				+ "                    btn.style.visibility = \"visible\";\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        </script>\r\n"
				+ "\r\n"
				+ "<!-- <button onclick=\"toggleInput()\">Show Input Field</button>\r\n"
				+ "<input type=\"text\" id=\"myInput\" placeholder=\"Enter something\">\r\n"
				+ "\r\n"
				+ "<script>\r\n"
				+ "  function toggleInput() {\r\n"
				+ "    var inputField = document.getElementById(\"myInput\");\r\n"
				+ "    \r\n"
				+ "    // Toggle the visibility of the input field\r\n"
				+ "    if (inputField.style.display === \"none\") {\r\n"
				+ "      inputField.style.display = \"block\";\r\n"
				+ "    } else {\r\n"
				+ "      inputField.style.display = \"none\";\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "</script> -->\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}
}
