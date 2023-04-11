package org.student;

import org.college.College;

public class Student extends College {
	
	
	public void studentName() {
		
	System.out.println("Write the student name");
		
	}
	
	public void studentDept() {
		
		System.out.println("Check the student name in which Department?");
			
		}
		
	public void studentId() {
		
		System.out.println("Write the student ID before name");
			
		}
	

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.departmentName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
	}

}
