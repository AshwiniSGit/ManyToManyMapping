package com.ash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_table")
public class Employees {
	@Id
	
	private Integer eId;
	
	private String eName;
	
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "tbl_emp_proj",
	joinColumns = @JoinColumn(name = "emp_id"), 
	inverseJoinColumns = @JoinColumn(name = "proj_id" ))
	private List<Projects> projects;


	public Integer geteId() {
		return eId;
	}


	public void seteId(Integer eId) {
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public List<Projects> getProjects() {
		return projects;
	}


	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}


	@Override
	public String toString() {
		return "Employees [eId=" + eId + ", eName=" + eName + ", projects=" + projects + "]";
	}
	
	

}
