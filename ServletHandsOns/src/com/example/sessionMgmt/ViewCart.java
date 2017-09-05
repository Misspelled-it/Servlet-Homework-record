package com.example.sessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewCart
 */
@WebServlet("/ViewCart")
public class ViewCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Shopping Cart</title></head>");
		out.print("<h1 style = 'margin-left:50%; margin-top:20%;'>NetBazaar</h1><body>");
		out.print("<h2 style = 'margin-left:50%;'>Products in Cart</h2>");
		out.print("<form method=\"post\" action=\"ViewCart\"><table>");
		if(session.getAttribute("dell") != null) {
			 out.print("<tr>\r\n" + 
			 		"		<td><label for=\"Dell\">Dell price 25000</label></td>\r\n" + 
			 		"		<td><input type=\"checkbox\" name=\"Dell\" id=\"Dell\" value=\"Dell price 25000\"/></td>\r\n" + 
			 		"	</tr>");
		}
		if(session.getAttribute("msi") != null) {
			out.print("<tr>\r\n" + 
					"		<td><label for=\"MSI\">MSI price 30000</label></td>\r\n" + 
					"		<td><input type=\"checkbox\" name=\"MSI\" id=\"MSI\" value=\"MSI price 30000\"/></td>\r\n" + 
					"	</tr>");
		}
		if(session.getAttribute("corsair") != null) {
			out.print("<tr>\r\n" + 
					"		<td><label for=\"Corsair\">Corsair Price 40000</label></td>\r\n" + 
					"		<td><input type=\"checkbox\" name=\"Corsair\" id=\"Corsair\" value=\"Corsair Price 40000\"/></td>\r\n" + 
					"	</tr>");
		}
		out.print("<tr>\r\n" + 
				"		<td><input type=\"submit\" name=\"Submit\" id=\"Submit\" value=\"Remove Selected Items\"/></td>\r\n" + 
				"	</tr>");
		out.print("<form method=\"post\" action =\"SuccessServlet\">\r\n" + 
				"	<input type=\"submit\" name=\"Submit\" id=\"Submit\" value=\"Purchase Items\"/></td>\r\n" + 
				"</form>");
		out.print("</table>\r\n"+
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(request.getParameter("Dell") != null) {
			session.removeAttribute("dell");
		}
		if(request.getParameter("MSI") != null) {
			session.removeAttribute("msi");
		}
		if(request.getParameter("Corsair") != null) {
			session.removeAttribute("corsair");
		}
		
		response.sendRedirect("ViewCart");
	}
}
