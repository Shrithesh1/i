package com.react.injuction;

public class StudentDetails {

	private Student student1;
	private Student student2;
	private Student student3;
	
	public Student getStudent1() {
		return student1;
	}
	public void setStudent1(Student student1) {
		this.student1 = student1;
	}
	public Student getStudent2() {
		return student2;
	}
	public void setStudent2(Student student2) {
		this.student2 = student2;
	}
	public Student getStudent3() {
		return student3;
	}
	public void setStudent3(Student student3) {
		this.student3 = student3;
	}
	
	public void Display() {
	
		System.out.println("");
		System.out.println("Student Data 1 = [ Id = "+student1.getId()+ ", Name = "+student1.getName()+", RegNo = "+student1.getRegNo() + " ]");
		System.out.println("Student Data 2 = [ Id = "+student2.getId()+ ", Name = "+student2.getName()+", RegNo = "+student2.getRegNo() + " ]");
		System.out.println("Student Data 3 = [ Id = "+student3.getId()+ ", Name = "+student3.getName()+", RegNo = "+student3.getRegNo() + " ]");

	}
}
