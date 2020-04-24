package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.hefshine.bean.Student;

public class StudentDAO {
	
	String DB_DRIVER="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/janbatch";
	String DB_USER="root";
	String DB_PASSWORD="";
	
	Connection con;
	PreparedStatement pst;
	
	public void OpenDB() {
		try {
		Class.forName(DB_DRIVER);
		
		con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int insertData(Student stud) {
		int status=0;
		String query="insert into studentregister (name,gender,mobileno,emailid,degree,technology,address,password) values (?,?,?,?,?,?,?,?) ";
		
		try {
			OpenDB();
			
			pst=con.prepareStatement(query);
			pst.setString(1, stud.getName());
			pst.setString(2, stud.getGender());
			pst.setString(3, stud.getMobileno());
			pst.setString(4, stud.getEmailid());
			pst.setString(5, stud.getDegree());
			pst.setString(6, stud.getTechnology());
			pst.setString(7, stud.getAddress());
			pst.setString(8, stud.getPassword());
			
			status=pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			CloseDB();
		}
		
		
		return status;
	}
	
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
