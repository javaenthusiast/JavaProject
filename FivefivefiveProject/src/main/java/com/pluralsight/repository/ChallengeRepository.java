package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Challenge;

public interface ChallengeRepository {
	
	Challenge save(Challenge challenge);

	List<Challenge> loadAll();

	
}
