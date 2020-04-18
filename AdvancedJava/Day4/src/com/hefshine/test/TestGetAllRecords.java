package com.hefshine.test;

import java.util.ArrayList;
import java.util.List;

import com.hefshine.bean.Employee;
import com.hefshine.dao.EmployeeDAO;

public class TestGetAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		List<Employee> arraylist=new ArrayList<Employee>();
		
		arraylist=dao.getAllRecords();
		
		for(Employee emp:arraylist) {
			
			System.out.println("Employee No "+emp.getEmpno());
			System.out.println("First Name:: "+emp.getFname());
			System.out.println("Last Name:: "+emp.getLname());
			System.out.println("Mobile No :: "+emp.getMobileno());
			System.out.println("Email ID :: "+emp.getEmailid());
			System.out.println("-----------------------------------------------");
		}
		
		

	}

}
