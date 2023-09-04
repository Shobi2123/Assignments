package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("The name of the student is: Shobana");
	}
	public void studentDept() {
		System.out.println("The depatment of the Student is IT");
	}
	public void studentId() {
		System.out.println("The ID is 00115588");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.deptName();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		
	}
}

