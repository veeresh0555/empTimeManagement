package com.emptimetrack.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emptimetrack.model.Employe;


@Repository
public class EmployeDaoImp implements EmployeDao {

  @Autowired
   private SessionFactory sessionFactory;

	
	@Override
	public List<Employe> list() {
		 Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Employe> cq = cb.createQuery(Employe.class);
	      Root<Employe> root = cq.from(Employe.class);
	      cq.select(root);
	      Query<Employe> query = session.createQuery(cq);
	      return query.getResultList();
	}


	@Override
	public long save(Employe emp) {
		 sessionFactory.getCurrentSession().save(emp);
	      return emp.getEid();
	}
	
	
	
	
	
	
	
	

}
