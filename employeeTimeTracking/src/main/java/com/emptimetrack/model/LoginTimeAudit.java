package com.emptimetrack.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LoginTimeAudit {

	@Id
	private Long id;
	
	private Date intime;
	
	private Time outtime;

	@ManyToOne
	LogintimeMaster logintimemaster;
	
	
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
