package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

/**
 * Servlet implementation class GetAllRecordServlet
 */
public class GetAllRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentDAO dao=new StudentDAO();
		List<Student> list= dao.getAllRecord();
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		
		pw.print("<html><head><title>Register</title></head><body>");
		pw.print("<table border='1px'> <thead> <th>#</th> <th>Name</th><th>Gender</th><th>MobileNo</th><th>Email Id</th></thead>");
		pw.print("<tbody>");
		int i=1;
		for (Student student : list) {
			
			pw.print("<tr style='padding:5px;'>");
			pw.print("<td style='padding:5px;'> "+i+"</td>");
			pw.print("<td style='padding:5px;'> "+student.getName()+"</td>");
			pw.print("<td style='padding:5px;'> "+student.getGender()+"</td>");
			pw.print("<td style='padding:5px;'> "+student.getMobileno()+"</td>");
			pw.print("<td style='padding:5px;'> "+student.getEmailid()+"</td>");
			pw.print("</tr>");
			i++;
		}
		
		pw.print("</tbody></table>");
		pw.print("</body></html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
