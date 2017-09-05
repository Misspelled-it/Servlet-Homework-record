package com.example.sessionMgmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MobilesServlet
 */
@WebServlet("/MobilesServlet")
public class MobilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(request.getParameter("Samsung") != null) {
			session.setAttribute("samsung", request.getParameter("Samsung"));
		}
		if(request.getParameter("LG") != null) {
			session.setAttribute("lg", request.getParameter("LG"));
		}
		if(request.getParameter("Nokia") != null) {
			session.setAttribute("nokia", request.getParameter("Nokia"));
		}
		response.sendRedirect("mobiles.html");
		
	}

}
