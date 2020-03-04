package com.emptimetrack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employe {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long eid;
	   private String ename;
	   private String designation;
	   private String location;
	
	   
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	   
	   
	   
	   
	
	
	
}
