package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public int updateData(Student stud) {
		int status=0;
		
		String query="update studentregister set mobileno=?,address=? where emailid=?";
		try {
			OpenDB();
			
			pst=con.prepareStatement(query);
			pst.setString(1, stud.getMobileno());
			pst.setString(2, stud.getAddress());
			pst.setString(3, stud.getEmailid());
			
			status=pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally {
			CloseDB();
		}
		
		
		
		return status;
	}
	
	
	public List<Student> getAllRecord() {
		List<Student> list=new ArrayList<Student>();
		String query="select *  from studentregister";
		try {
			OpenDB();
			pst=con.prepareStatement(query);
			
			rs=pst.executeQuery();
			
			while(rs.next()) {
				Student s=new Student();
				s.setName(rs.getString("name"));
				s.setGender(rs.getString("gender"));
				s.setMobileno(rs.getString("mobileno"));
				s.setEmailid(rs.getString("emailid"));
				
				list.add(s);		
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			CloseDB();
		}
		
		return list;
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
