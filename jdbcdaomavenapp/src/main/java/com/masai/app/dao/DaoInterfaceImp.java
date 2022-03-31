package com.masai.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.masai.app.beans.Employee;
import com.masai.app.exception.EmployeeException;
import com.masai.app.utility.EmployeeDBUtil;

public class DaoInterfaceImp implements DaoInterface{

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		
		Employee marks = null;
		
		try(Connection conn = EmployeeDBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from Employee where empid=?");
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("empName");
				String address = rs.getString("ampAddress");
				int salary = rs.getInt("empSalary");
				
				Employee employee = new Employee(id,name,address,salary);
		
			}else {
				EmployeeException empEx = new EmployeeException("Employee doesn't exists");
				throw empEx;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
		
		return marks;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
