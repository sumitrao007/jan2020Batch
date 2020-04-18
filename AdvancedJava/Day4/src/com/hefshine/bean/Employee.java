package com.hefshine.bean;

public class Employee {
	
 private int empno;
 private String fname;
 private String lname;
 private String mobileno;
 private String emailid;
	
	public Employee() {
		
	}
	
	public Employee(int empno, String fname, String lname, String mobileno, String emailid) {
		super();
		this.empno = empno;
		this.fname = fname;
		this.lname = lname;
		this.mobileno = mobileno;
		this.emailid = emailid;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", fname=" + fname + ", lname=" + lname + ", mobileno=" + mobileno
				+ ", emailid=" + emailid + "]";
	}
	
	
	

}
