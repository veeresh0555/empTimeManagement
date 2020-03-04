package com.emptimetrack.dao;

import java.util.List;

import com.emptimetrack.model.Employe;

public interface EmployeDao {

	List<Employe> list();

	long save(Employe emp);

	
	
	
}
