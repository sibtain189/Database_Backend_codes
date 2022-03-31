package com.masai.app.usecases;

import java.util.List;

import com.masai.app.beans.Student;
import com.masai.app.dao.StudentDao;
import com.masai.app.dao.StudentDaoImpl;

public class GetAllStudentUseCase {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		List<Student> students= dao.getAllStudentDetails();
		
		students.forEach(s -> {
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
			System.out.println("===========================");
			
			
		});
		
		
		

	}

}
