package com.hefshine.test;

import com.hefshine.bean.Employee;
import com.hefshine.dao.EmployeeDAO;

public class TestInsert {

	public static void main(String[] args) {
		
		EmployeeDAO dao=new EmployeeDAO();
		
		//int status=dao.inserData("Newton","Iftekar","7894561234","newton@gmail.com");
		
		Employee emp=new Employee();
		emp.setFname("Alok");
		emp.setLname("Kolekar");
		emp.setMobileno("9874563213");
		emp.setEmailid("alok@gmail.com");
		
		int status=dao.inserData(emp);
		
		if(status>0) {
			System.out.println("Data Insertated Successfully");
		}else {
			System.out.println("Data is not Insertated Successfully");
		}
		

	}

}
