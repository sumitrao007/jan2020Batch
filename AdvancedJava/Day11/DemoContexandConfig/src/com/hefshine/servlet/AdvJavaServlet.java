package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdvJavaServlet
 */
public class AdvJavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvJavaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext contex= getServletContext();
		
		String insName= contex.getInitParameter("Institutename");
		
		String address= contex.getInitParameter("Address");
		
		
		ServletConfig config= getServletConfig();
		
		String trainer1= config.getInitParameter("Trainer1");
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		pw.print("<html><head><title>Servlet context config </title></head><body>");
		pw.print("<h1> "+insName +" Whose Location is "+address+"</h1>");
		pw.print("<h2> Trainer Available is "+trainer1 +"</h1>");
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
