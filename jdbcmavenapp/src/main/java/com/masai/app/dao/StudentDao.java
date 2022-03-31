package com.masai.app.dao;

import java.util.List;

import com.masai.app.beans.Student;
import com.masai.app.exceptions.StudentException;

public interface StudentDao {
	
	public String insertStudentDetails(int roll,String name,int marks);
	
	public String insertStudentDetails2(Student student);
	
	public int getStudentMarksByRoll(int roll)throws StudentException;
	
	public Student getStudentDetailsByRoll(int roll)throws StudentException;
	
	public int giveTheGraceMarks(int marks);
	
	public List<Student> getAllStudentDetails();
	
	
	
	

}
