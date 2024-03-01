package com.ash.dao;


import java.util.List;

import com.ash.entity.Employees;
import com.ash.entity.Projects;


public interface EmployeeDao {
	
	String saveEmployees(Employees emp);
	
	Employees  fetchEmployees(Integer  empId);
	
	Projects fetchProjectDetails(Integer projId);
	
	void deleteEmployee(Integer empId);
	
	void deleteProjects(Integer projId);

}
