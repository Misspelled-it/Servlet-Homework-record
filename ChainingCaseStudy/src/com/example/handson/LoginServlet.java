package com.example.handson;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		if(user.equalsIgnoreCase("admin") && pass.equals("admin")) {
			response.sendRedirect("SuccessServlet?user="+user);
		}
		else {
			request.setAttribute("error", "username and/or password are incorrect");
			RequestDispatcher dispatcher = request.getRequestDispatcher("ErrorServlet");
			dispatcher.forward(request, response);
		}
		
	}

}
