package com.example.sessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexPage
 */
@WebServlet("/IndexPage")
public class IndexPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Main Menu</title></head>");
		out.print("<h1 style = 'margin-left:50%; margin-top:20%;'>NetBazaar</h1><body>");
		out.print("<a href='mobiles.html'/>Mobiles</a><br/>");
		out.print("<a href='laptops.html'/>Laptops</a><br/>");
		out.print("<a href='watches.html'/>Watches</a><br/>");
		out.print("</body></html>");
	}

}
