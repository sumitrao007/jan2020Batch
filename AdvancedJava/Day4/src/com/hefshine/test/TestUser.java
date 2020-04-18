package com.hefshine.test;

import com.hefshine.dao.EmployeeDAO;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao=new EmployeeDAO();
		
		boolean checkuser=dao.CheckUser("Dattu123", "dattu@gmail.com");
		
		if(checkuser) {
			System.out.println("User is Valid......");
			
		}else
		{
			System.out.println("User is InValid...... Please Chech Your email ID & First name");
		}
		
		
	}

}
