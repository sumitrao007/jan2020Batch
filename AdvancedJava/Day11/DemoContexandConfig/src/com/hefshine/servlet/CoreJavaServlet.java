package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoreJavaServlet
 */
public class CoreJavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoreJavaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext context= getServletContext();
		String insName=	context.getInitParameter("Institutename");
		System.out.println("Institute Name Is "+insName);
		
		ServletConfig config= getServletConfig();
		
		
//		String trainer1=config.getInitParameter("Trainer1");
//		
//		String trainer2=config.getInitParameter("Trainer2");
//		
//		System.out.println("Trainer 1 name is "+trainer1);
//		System.out.println("Trainer 2 name is "+trainer2);
		
		
			Enumeration iterate= config.getInitParameterNames();
			String trainers,trainersname;
			
			while(iterate.hasMoreElements()) {
				trainers=(String) iterate.nextElement(); 
				trainersname=config.getInitParameter(trainers);
				System.out.println("Trainer Name is "+trainersname);
				
			}
			
		
		
		
		
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
//		pw.print("<html><head><title>Servlet context config </title></head><body>");
//		pw.print("<h1> "+insName +"</h1>");
//	//	pw.print("<h2> Trainer Available is "+trainer1 +" & "+trainer2+"</h1>");
//		pw.print("</body></html>");
//		pw.close();
		pw=null;
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

}
