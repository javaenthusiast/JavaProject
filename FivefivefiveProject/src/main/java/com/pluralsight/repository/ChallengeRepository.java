package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Challenge;

@Repository("challengeRepository")
public interface ChallengeRepository extends JpaRepository<Challenge, Long>{
	
	/*Challenge save(Challenge challenge);

	List<Challenge> loadAll();
*/
	
}
