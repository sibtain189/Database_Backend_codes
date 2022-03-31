package com.masai.app.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.app.beans.Student;
import com.masai.app.dao.StudentDao;
import com.masai.app.dao.StudentDaoImpl;

public class InsertStudentUseCase {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter the Roll number: ");
//		int roll= sc.nextInt();
//
//		System.out.println("Enter Name: ");
//		String name= sc.next();
//		
//		System.out.println("Enter Marks: ");
//		int marks= sc.nextInt();

		
		//StudentDaoImpl dao = new StudentDaoImpl();
		
		StudentDao dao = new StudentDaoImpl();
		
		//String result= dao.insertStudentDetails(roll, name, marks);
		
		//System.out.println(result);
		
		//Student student = new Student();
		//student.setRoll(roll);
		//student.setName(name);
		
//		Student student = new Student(roll, name, marks);
		Student student = new Student(37,"fhdfhd", 456);
		
		String result= dao.insertStudentDetails2(student);
		
		System.out.println(result);
		
		
		
	}

}
