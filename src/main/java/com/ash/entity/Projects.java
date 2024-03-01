package com.ash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Projects_tbl")
public class Projects {
	@Id
		private Integer pId;
	
	private String pName;
	
	@ManyToMany(cascade = { CascadeType.PERSIST , CascadeType.MERGE},fetch = FetchType.EAGER 
			, mappedBy = "projects")
	private List<Employees> emp;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employees> getEmp() {
		return emp;
	}

	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}

	

}
