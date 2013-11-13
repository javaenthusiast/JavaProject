package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Challenge;

@Repository("challengeRepository")
public class ChallengeRepositoryImpl implements ChallengeRepository {

	
	@PersistenceContext
	private EntityManager em;
	
	public Challenge save(Challenge challenge) {
		
		em.persist(challenge);
		em.flush();//jpa wouldnt save to the db until we do a flush. notes to remember.
		return challenge;
	}

}
