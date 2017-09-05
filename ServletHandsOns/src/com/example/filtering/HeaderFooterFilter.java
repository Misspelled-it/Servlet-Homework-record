package com.example.filtering;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class HeaderFooterFilter
 */
@WebFilter("/HeaderFooterFilter")
public class HeaderFooterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HeaderFooterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Home</title></head>");
		out.print("<h1 style = 'margin-left:50%; margin-top:20%;'>My Friends</h1>");
		chain.doFilter(request, response);
		out.print("<h1 style = 'margin-left:50%; margin-top:20%;'> @copyright 2010-2012 <br/>Rights Reserved XYZ Corporation</h1>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
