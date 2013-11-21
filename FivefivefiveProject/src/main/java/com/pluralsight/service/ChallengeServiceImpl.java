package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Challenge;
import com.pluralsight.repository.ChallengeRepository;


@Service("challengeService")
public class ChallengeServiceImpl implements ChallengeService {

	@Autowired
	private ChallengeRepository challengeRepository;
	
	@Transactional
	public Challenge save(Challenge challenge) {
		
		return challengeRepository.save(challenge);
	}

	public List<Challenge> findAllChallenges() {
		return challengeRepository.loadAll();
		
	}



}
