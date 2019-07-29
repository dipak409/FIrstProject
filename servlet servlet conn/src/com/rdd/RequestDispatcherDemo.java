package com.rdd; 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;

public class RequestDispatcherDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		//Declaration of string variables
		String var1021=request.getParameter("var1021");//variable 1
		String var2021=request.getParameter("var2021");//variable 2
				if(var1021.equals("dipak") && var2021.equals("dipak"))//it checks two strings and compare that value if the condition is valid it enter to first part of if otherwise it enter to else part
				{
			RequestDispatcher rd=request.getRequestDispatcher("valid");// if this part is valid it enter to this part
			rd.forward(request,response);
			/*RequestDispatcher*/
				}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("invalid");//if this part is valid then enter to this part
			rd.forward(request,response);
			}
	
	}
}
