package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
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
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		pw.print("<html><head><title>Home</title></head><body>");
		pw.print("<h1> Welcome "+request.getParameter("emailid")+"</h1></body><html>");
		pw.close();
		pw=null;
		
	//	doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		pw.print("<html><head><title>Home</title></head><body>");
		pw.print("<h1> Welcome "+request.getParameter("emailid")+"</h1></body><html>");
		pw.close();
		pw=null;
		
		
		
	}

}
