package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.beans.Student;
import com.masai.app.dao.StudentDao;
import com.masai.app.dao.StudentDaoImpl;
import com.masai.app.exceptions.StudentException;

public class GetStudentUseCase {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Roll number: ");
		int roll= sc.nextInt();
		
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			Student student= dao.getStudentDetailsByRoll(roll);
			
			System.out.println(student);
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
