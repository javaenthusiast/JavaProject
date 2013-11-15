package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	/*public List<Challenge> loadAll() {
		Query query = em.createQuery("Select c from Challenge c");
		List challenges = query.getResultList();
		return challenges;
	}*/

}
