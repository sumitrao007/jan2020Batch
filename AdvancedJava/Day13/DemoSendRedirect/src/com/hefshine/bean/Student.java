package com.hefshine.bean;

public class Student {
	
	private int id;
	private String name;
	private String gender;
	private String mobileno;
	private String emailid;
	private String degree;
	private String technology;
	private String password;
	private String address;
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, String gender, String mobileno, String emailid, String degree,
			String technology, String password, String address) {
	
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.degree = degree;
		this.technology = technology;
		this.password = password;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", mobileno=" + mobileno + ", emailid="
				+ emailid + ", degree=" + degree + ", technology=" + technology + ", password=" + password
				+ ", address=" + address + "]";
	}
	
	
	
	
	

}
