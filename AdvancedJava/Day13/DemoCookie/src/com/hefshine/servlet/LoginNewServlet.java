package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginNewServlet
 */
public class LoginNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginNewServlet() {
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
		System.out.println("In Do post Method");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		
		Cookie c=new Cookie("username", username);
		response.addCookie(c);
		
		Cookie c1=new Cookie("password", password);
		response.addCookie(c1);
		
		pw.print("<html><head><title>Demo Cookie</title></head><body>");
		pw.print("<h1> Welcome User "+username+"</h1>");
		
		pw.print("<form action='HomeServlet' method='post'>");
		pw.print("<input type='submit' value='HOME'></form></body></html>");
		pw.close();
		pw=null;
	}

}
