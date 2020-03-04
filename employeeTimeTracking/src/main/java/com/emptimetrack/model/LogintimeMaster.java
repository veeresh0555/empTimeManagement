package com.emptimetrack.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LogintimeMaster {

	@Id
	private Long id;
	
	private Date intime;
	
	private Time outtime;
	
	@OneToMany
	List<LoginTimeAudit> loginaudit;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getIntime() {
		return intime;
	}

	public void setIntime(Date intime) {
		this.intime = intime;
	}

	public Time getOuttime() {
		return outtime;
	}

	public void setOuttime(Time outtime) {
		this.outtime = outtime;
	}
	
	
}
