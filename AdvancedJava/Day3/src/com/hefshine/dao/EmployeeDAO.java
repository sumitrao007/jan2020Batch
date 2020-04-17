package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hefshine.bean.Employee;

public class EmployeeDAO {
	
	String DB_DRIVER = "com.mysql.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/janbatch";
	String DB_USER = "root";
	String DB_PASSWORD = "";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	//Step 1 &2 
	public void OpenDB() {
		
		try {
			Class.forName(DB_DRIVER);
			con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
//	//Step 3 & 4
//	public int inserData(String myfname,String mylname,String mymobileno,String myemailid) {
//		
//		int status=0;
//		String query="INSERT INTO employee (fname,lname,mobileno,emailid) VALUES (?,?,?,?)";
//		
//		try {
//			OpenDB();
//			pst=con.prepareStatement(query);
//			pst.setString(1, myfname);
//			pst.setString(2, mylname);
//			pst.setString(3,mymobileno );
//			pst.setString(4, myemailid);
//			status=pst.executeUpdate();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally {
//			CloseDB();
//		}
//		
//		return status;
//		
//	}
	
	public int inserData(Employee emp) {
		int status=0;
		String query="INSERT INTO employee (fname,lname,mobileno,emailid) VALUES (?,?,?,?)";
		
		try {
			OpenDB();
			pst=con.prepareStatement(query);
			pst.setString(1, emp.getFname());
			pst.setString(2, emp.getLname());
			pst.setString(3, emp.getMobileno());
			pst.setString(4, emp.getEmailid());
			status=pst.executeUpdate();

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			CloseDB();
		}	
		
		
		return status;
		
	}
	
	
	public int updateData(Employee emp) {
		int status=0;
		
		String query="update employee set fname=?, mobileno=? where empno=?";
		
		try {
			OpenDB();
			pst=con.prepareStatement(query);
			pst.setString(1, emp.getFname());
			pst.setString(2, emp.getMobileno());
			pst.setInt(3, emp.getEmpno());
			status=pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			CloseDB();
		}
		
		
		return status;
		
	}
	
	
	public int deleteParticularData(String myemailid) {
		int status=0;
		String query="DELETE FROM employee WHERE emailid=?";
		try {
			OpenDB();
			
			pst=con.prepareStatement(query);
			pst.setString(1, myemailid);
			status=pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			CloseDB();
		}
				
		return status;		
	}
	
	public Employee getParticularData(int id) {
		Employee emp=new Employee();
		String query="select * from employee where empno=?";
		
		try {
			OpenDB();
			
			pst=con.prepareStatement(query);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			
			if(rs.next()) {
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setMobileno(rs.getString("mobileno"));
				emp.setEmailid(rs.getString("emailid"));
				
				
			}			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			CloseDB();
		}
		
		
		return emp;
		
		
		
	}
	
	
	
	
	
	//Step 5
	public void CloseDB() {
		try {
			if(con!=null) {
				con.close();
				con=null;
			}
			if(pst!=null) {
				pst.close();
				pst=null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	

}
