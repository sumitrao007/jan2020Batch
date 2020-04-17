package com.hefshine.test;

import com.hefshine.dao.EmployeeDAO;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAO();
		
		String emailid="hefshine.sumit@gmail.com";
		
		int status=dao.deleteParticularData(emailid);
		
		
		if(status>0) {
			System.out.println("Data Deleteated  Successfully");
		}else {
			System.out.println("Data is not Deleteated Successfully");
		}
		

	}

}
