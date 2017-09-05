package com.example.sessionMgmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LaptopServlet
 */
@WebServlet("/LaptopServlet")
public class LaptopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(request.getParameter("Dell") != null) {
			session.setAttribute("dell", request.getParameter("Dell"));
		}
		if(request.getParameter("MSI") != null) {
			session.setAttribute("msi", request.getParameter("MSI"));
		}
		if(request.getParameter("Corsair") != null) {
			session.setAttribute("corsair", request.getParameter("Corsair"));
		}
		response.sendRedirect("laptops.html");
	}

}
