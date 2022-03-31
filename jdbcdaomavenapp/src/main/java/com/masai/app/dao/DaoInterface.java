package com.masai.app.dao;

import java.util.List;

import com.masai.app.beans.Employee;
import com.masai.app.exception.EmployeeException;

public interface DaoInterface {
	
	public Employee getEmployeeById(int id) throws EmployeeException;
	
	public List<Employee> getAllEmployee();
	
	public String saveEmployeeDetails(Employee employee);
	
	public boolean deleteEmployeeById(int empId) throws EmployeeException;
	
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException;

}
