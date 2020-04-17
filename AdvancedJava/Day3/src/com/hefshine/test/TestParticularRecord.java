package com.hefshine.test;

import com.hefshine.bean.Employee;
import com.hefshine.dao.EmployeeDAO;

public class TestParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		int id=6;
		
		Employee emp=dao.getParticularData(id);
		
		System.out.println("Fname is "+emp.getFname());
		System.out.println("lname is "+emp.getLname());
		System.out.println("Mobile No"+emp.getMobileno() );
		System.out.println("Email Id "+emp.getEmailid() );
		

	}

}
