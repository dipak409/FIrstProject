package com.cutm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqServlet
 */
public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;//default id

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();//session created
		
		int k021 = (int)session.getAttribute("k021");
		k021 = k021 * k021;//square of the variable
	    PrintWriter out = response.getWriter();
	    out.println("Result is"+ k021);//output of the variable
	    }

}
