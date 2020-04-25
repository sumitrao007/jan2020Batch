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
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		String mobileno=request.getParameter("mobileno");
		String address=request.getParameter("address");
		
		
		
		Student student=new Student();
		student.setEmailid(emailid);
		student.setMobileno(mobileno);
		student.setAddress(address);
		
		StudentDAO dao=new StudentDAO();
		int status=dao.updateData(student);
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		pw.print("<html><head><title>Register</title></head><body>");
		if(status>0) {
			
			pw.print("<div style='color:green;'> Data Update successfully.... </div>");
			
		}else
		{
			pw.print("<div style='color:red;'> Data Not Update successfully.... </div>");
		}
		
		pw.print("</body></html>");
		pw.close();
		pw=null;
		
		
		
	}

}
