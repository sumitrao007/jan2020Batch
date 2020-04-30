package com.hefshineservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session= request.getSession();
		String username;
		
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		pw.print("<html><head><title>Demo Session</title></head><body>");
		
		if(session.getAttribute("username").toString().equalsIgnoreCase(null)) {
			username= session.getAttribute("username").toString();
			pw.print("<h1> Welcome User "+username+"</h1>");
			
		}else
		{
			pw.print("<h1> Welcome You are a Guest User </h1>");
		}
		
		
		
		
		pw.print("<a href='LogoutServlet' style='float:right'>Logout</a>");
		
		pw.print("</body></html>");
		pw.close();
		pw=null;
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
