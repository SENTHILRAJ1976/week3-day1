package org.college;

import org.department.Department;

public class College extends Department {
	
	
	public void collegeName() {
		System.out.println("Write the College Name");
	}
	
	
	public void collegeCode() {
		System.out.println("Mention the College Code");		
		
	}
	
	
	
	public void collegeRank() {
		System.out.println("Evaluate the College Rank");		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College col = new College();
		
		
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		col.departmentName();
	}

}
