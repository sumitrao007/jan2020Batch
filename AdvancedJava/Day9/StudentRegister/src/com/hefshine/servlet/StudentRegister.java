package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

/**
 * Servlet implementation class StudentRegister
 */
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
		System.out.println("You Are in Post Method...");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String mobileno=request.getParameter("mobileno");
		String emailid=request.getParameter("emailid");
		String degree=request.getParameter("degree");
		String technology[]=request.getParameterValues("technology");
		String address=request.getParameter("address");
		String password= request.getParameter("password");
		
		String temptech="";
		
		for (int i = 0; i < technology.length; i++) {
			System.out.println("Technology is "+technology[i]);
			
			temptech=temptech+technology[i]+",";
			
		}
		
		Student student=new Student();
		student.setName(name);
		student.setGender(gender);
		student.setMobileno(mobileno);
		student.setEmailid(emailid);
		student.setDegree(degree);
		student.setAddress(address);
		student.setPassword(password);
		student.setTechnology(temptech);
		
		StudentDAO dao=new StudentDAO();
		int status=dao.insertData(student);
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		
		if(status>0) {
			pw.print("<html><head><title>Register</title></head><body>");
	//		pw.print("<h1 style='color:green'> Register Successfully </h1></body></html>");
			pw.print("<h1 style=\"color:green\"> Register Successfully </h1></body></html>");
		}else
		{
			pw.print("<html><head><title>Register</title></head><body>");
			pw.print("<h1 style='color:red'> Register Not Successfully </h1></body></html>");
		}
		
		
		
		pw.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
