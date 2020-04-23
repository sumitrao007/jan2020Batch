package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("You are in Do get Method !!!!");
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		
		System.out.println("Email Id is "+emailid);
		System.out.println("Password  is "+password);
		
		
		PrintWriter pw =response.getWriter();
		response.setContentType("text/html");
		pw.print("<html><head><title>Form Processing</title></head>");
		pw.print("<body> <h1>Thank you for request</h1>");
		pw.print("<h2> Email Id is "+emailid+"</h2>"); 
		pw.print("<h2>Password is "+password+"</h2>");
		pw.print("</body></html>");
		pw.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("You are in Post Method.........");
		
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		
		System.out.println("Email Id is "+emailid);
		System.out.println("Password  is "+password);
		
		
		PrintWriter pw =response.getWriter();
		response.setContentType("text/html");
		pw.print("<html><head><title>Form Processing</title></head>");
		pw.print("<body> <h1>Thank you for request</h1>");
		pw.print("<h2> Email Id is "+emailid+"</h2>"); 
		pw.print("<h2>Password is "+password+"</h2>");
		pw.print("</body></html>");
		pw.close();
		
	}

}
