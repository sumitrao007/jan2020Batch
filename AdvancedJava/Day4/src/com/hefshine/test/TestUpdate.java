package com.hefshine.test;

import com.hefshine.bean.Employee;
import com.hefshine.dao.EmployeeDAO;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao=new EmployeeDAO();
		Employee emp=new Employee();
		emp.setEmpno(1);
		emp.setFname("SUMIT");
		emp.setMobileno("7972547618");
		
		int status=dao.updateData(emp);
		
		if(status>0) {
			System.out.println("Data updatated Successfully");
		}else {
			System.out.println("Data is not updatated Successfully");
		}
		
	}

}
