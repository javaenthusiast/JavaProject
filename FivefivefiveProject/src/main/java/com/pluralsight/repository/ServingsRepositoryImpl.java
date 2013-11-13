package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Servings;


@Repository("servingsRepository")
public class ServingsRepositoryImpl implements ServingsRepository {

	
	@PersistenceContext
	private EntityManager em;
	
	
	public Servings save(Servings servings) {
		
		em.persist(servings);
		em.flush();
		return servings;
	}

}
