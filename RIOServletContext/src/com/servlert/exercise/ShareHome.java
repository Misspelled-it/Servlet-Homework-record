package com.servlert.exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShareHome
 */
@WebServlet("/ShareHome")
public class ShareHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = context.getAttribute("email ID").toString();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><head> EBUY <br>");
		out.print("<title>Share Home</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("Welcome to the ShareHome page");
		out.print("</body>");
		out.print("<footer> Copyright Cognizant Technology solution. Webmaster: " + email + "</footer>");
		out.print("</html>");
	}

}
