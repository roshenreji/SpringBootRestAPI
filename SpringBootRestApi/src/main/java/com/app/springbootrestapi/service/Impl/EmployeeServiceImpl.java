package com.app.springbootrestapi.service.Impl;

import java.util.List;

import com.app.springbootrestapi.dao.EmployeeDao;
import com.app.springbootrestapi.entity.Employee;
import com.app.springbootrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.*;;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findOne(employeeId);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		employeeDao.delete(employeeId);
		
	}

}
