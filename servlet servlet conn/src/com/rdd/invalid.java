package com.rdd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class valid
 */
public class invalid extends HttpServlet {
	private static final long serialVersionUID = 1L;//Default serial id 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("Try again...you enter wrong username and passsword");//it prints the message 
		}
}
