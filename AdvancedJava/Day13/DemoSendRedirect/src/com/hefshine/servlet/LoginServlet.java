package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		
		StudentDAO dao=new StudentDAO();
		Student student=new Student();
		student.setEmailid(emailid);
		student.setPassword(password);
		
		boolean status=dao.CheckUser(student);
		
			
		
		if(status) {
//			RequestDispatcher rd=request.getRequestDispatcher("Home");
//			
//			rd.forward(request, response);
			
			//use of Send redirect 
			//response.sendRedirect("Home");
			
			//use of Url Rewriting & send redirect
			
			response.sendRedirect("Home?emailid="+emailid);
			
			
			
		}else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			
			System.out.println("You Not Valid User!!!");
			
			PrintWriter pw= response.getWriter();
			pw.print("<h1 style='color:red'>You Are not Valid User Please Check your Email Id And Password****</h1>");
			
			rd.include(request, response);
			
			
		}
		
		
	}

}
