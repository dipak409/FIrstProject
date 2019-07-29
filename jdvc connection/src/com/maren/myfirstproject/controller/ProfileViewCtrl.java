package com.maren.myfirstproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.dao.ProfileDao;
import com.maren.myproject.model.Profile;

@WebServlet("/ProfileViewCtrl")
/**
 * Servlet implementation class ProfileViewCtrl
 */
public class ProfileViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;//Default serial id 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int res = (int) request.getAttribute("RES");
		PrintWriter out = response.getWriter();
		if (res == 0)//check the condition 
			out.println("There is some problem ;  Try again .");
		else
			out.println("Data Successfully inserted");
		//your data is successfully inserted
		out.print(" <br/> The Datas are");
		List<Profile> list =  new ProfileDao().fetchAll();
		for (Iterator<Profile> iterator = list.iterator(); iterator.hasNext();) {
			Profile profile = (Profile) iterator.next();
			out.println("Name : "+ profile.getName() +" Userid : "+ profile.getUserid()+ "mobile "+ profile.getMobile());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
