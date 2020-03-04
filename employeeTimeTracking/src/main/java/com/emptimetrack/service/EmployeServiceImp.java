package com.emptimetrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emptimetrack.dao.EmployeDao;
import com.emptimetrack.model.Employe;

@Service
@Transactional(readOnly = true)
public class EmployeServiceImp implements EmployeService {

	@Autowired
	EmployeDao empdao;
	
	
	@Override
	public List<Employe> list() {
		// TODO Auto-generated method stub
		return empdao.list();
	}


	@Transactional
	@Override
	public long save(Employe emp) {
		// TODO Auto-generated method stub
		 return empdao.save(emp);
	}

	
	
	
}
