package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Cookie cookies[]= request.getCookies();
		Cookie c=null;
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		pw.print("<html><head><title>Demo Cookie</title></head><body>");
		
		
		if(cookies!=null) {
			for (int i = 0; i < cookies.length; i++) {				
				c=cookies[i];
								
				pw.print("<h2>Cookie Name/Key "+c.getName()+", ");
				pw.print("Cookie Value "+c.getValue()+"</h2><br>");
			//	System.out.println("Cookie Name/Key "+c.getName());
			//	System.out.println("Cookie Value is "+c.getValue());
				
			}
		}else
		{
			pw.print("<h1> No cookies is present </h1>");
		}
		
		pw.print("</body></html>");
		
	}

}
