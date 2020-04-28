package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hefshine.bean.Student;

public class StudentDAO {
	String DB_DRIVER="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/janbatch";
	String DB_USER="root";
	String DB_PASSWORD="";
	
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void OpenDB() {
		try {
		Class.forName(DB_DRIVER);
		
		con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean CheckUser(Student stud) {
		boolean status=false;
		String query="select emailid, password from studentregister where emailid=? and password=?";
		
		try {
			OpenDB();
			pst=con.prepareStatement(query);
			pst.setString(1, stud.getEmailid());
			pst.setString(2, stud.getPassword());
			
			rs=pst.executeQuery();
			if(rs.next()) {
				status=true;
			}	
			
			
		} catch (Exception e) {
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
			if(rs!=null) {
				rs.close();
				rs=null;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
