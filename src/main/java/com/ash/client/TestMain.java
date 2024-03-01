package com.ash.client;

import java.util.Arrays;
import java.util.List;

import com.ash.dao.EmployeeDao;
import com.ash.dao.impl.EmployeeDaoImpl;
import com.ash.entity.Employees;
import com.ash.entity.Projects;



public class TestMain {
	public static void main(String[] args) {
		
EmployeeDao dao = new EmployeeDaoImpl();

 Employees  emp1 = new Employees();
 emp1.seteId(1);
 emp1.seteName("Apec");

Employees emp2 = new Employees();
emp2.seteId(2);
emp2.seteName("Hayat");

List<Employees> empList = Arrays.asList(emp1,emp2);

Projects proj1 = new Projects();
proj1.setpId(11);
proj1.setpName("AI Based");

Projects proj2 = new Projects();
proj2.setpId(22);
proj2.setpName("IOT Based");

Projects proj3 = new Projects();
proj3.setpId(33);
proj3.setpName("Machine learning based");

List<Projects> projsforemp1 = Arrays.asList(proj1,proj2);
List<Projects> projsforemp2 = Arrays.asList(proj1,proj2,proj3);

emp1.setProjects(projsforemp1);
emp2.setProjects(projsforemp2);

//dao.saveEmployees(emp1);
//dao.saveEmployees(emp2);

//Employees empdetails = dao.fetchEmployees(02);
//System.out.println("Emp Id " +empdetails.geteId());
//System.out.println("Emp Name " +empdetails.geteName());

//   Projects projdetails=dao.fetchProjectDetails(22);
//   System.out.println("Project Id-" +projdetails.getpId() );
//   System.out.println("Project Name -" +projdetails.getpName());
//   System.out.println("Employee Id- " +projdetails.getEmp());
  
//dao.deleteEmployee(1);

dao.deleteProjects(22);
		

	}

}
