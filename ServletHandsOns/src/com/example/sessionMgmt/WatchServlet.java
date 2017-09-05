package com.example.sessionMgmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WatchServlet
 */
@WebServlet("/WatchServlet")
public class WatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(request.getParameter("Seiko") != null) {
			session.setAttribute("seiko", request.getParameter("Dell"));
		}
		if(request.getParameter("Rolex") != null) {
			session.setAttribute("rolex", request.getParameter("MSI"));
		}
		if(request.getParameter("Casio") != null) {
			session.setAttribute("casio", request.getParameter("Corsair"));
		}
		response.sendRedirect("watches.html");
	}

}
