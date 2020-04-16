package com.hefshine.test;

import com.hefshine.dao.EmployeeDAO;

public class TestInsert {

	public static void main(String[] args) {
		
		EmployeeDAO dao=new EmployeeDAO();
		
		int status=dao.inserData("Newton","Iftekar","7894561234","newton@gmail.com");
		
		if(status>0) {
			System.out.println("Data Insertated Successfully");
		}else {
			System.out.println("Data is not Insertated Successfully");
		}
		

	}

}
