package com.ash.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ash.dao.EmployeeDao;
import com.ash.entity.Employees;

import com.ash.entity.Projects;

public class EmployeeDaoImpl  implements EmployeeDao {
//	private static EntityManagerFactory  factory;
//	static {
//	
//  factory = Persistence.createEntityManagerFactory("ashu");
//	}

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("ashu");


	public String saveEmployees(Employees emp) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		String msg = null;
		
		try {
			em.merge(emp);
			tx.commit();
			msg = "Employee data saved";
			
		}
		catch(Exception e) {
			msg = "Emp data failed to save ";
			tx.rollback();
			e.printStackTrace();
			
		}
		finally {
			em.close();
	}
		return msg;
	}

	public Employees fetchEmployees(Integer empId) {
		EntityManager em = factory.createEntityManager();
		Employees emp = em.find(Employees.class, empId);
		em.close();
		return emp;
	}
	

	public Projects fetchProjectDetails(Integer projId) {
		EntityManager em = factory.createEntityManager();
		Projects proj = em.find(Projects.class, projId);
		em.close();
		return proj;
		
	}

	public void deleteEmployee(Integer empId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Employees emp = em.find(Employees.class, empId);
		tx.begin();
		try {
			em.remove(emp);
			tx.commit();
			System.out.println("deleted Employee with id : " + empId);
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Failed to delete Employee with id : " + empId);
			e.printStackTrace();
		
	}
	}

	public void deleteProjects(Integer projId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Projects pro = em.find(Projects.class, projId);
		tx.begin();
		try {
			em.remove(pro);
			tx.commit();
			System.out.println("deleted Employee with id : " + projId);
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Failed to delete Employee with id : " + projId);
			e.printStackTrace();
		
	}
	}
}
