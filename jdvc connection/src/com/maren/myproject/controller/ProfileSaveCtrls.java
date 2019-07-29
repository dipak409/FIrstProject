package com.maren.myproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.dao.ProfileDao;
import com.maren.myproject.model.Profile;

@WebServlet("/ProfileSaveCtrls")

/**
 * Servlet implementation class ProfileSaveCtrls
 */
public class ProfileSaveCtrls extends HttpServlet {
	private static final long serialVersionUID = 1L;//Default serial id 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Profile profile = new Profile();
		profile.setUserid(request.getParameter("userid"));
		profile.setName(request.getParameter("name"));
		profile.setEmail(request.getParameter("email"));
		profile.setMobile(Long.parseLong(request.getParameter("mobile")));
		// save in database
		int res = new ProfileDao().save(profile);
		request.setAttribute("RES", res);
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);
	}

}
