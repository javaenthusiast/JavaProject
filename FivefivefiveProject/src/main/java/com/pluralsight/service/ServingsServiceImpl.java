package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Servings;
import com.pluralsight.repository.ServingsRepository;


@Service("servingsService")
public class ServingsServiceImpl implements ServingsService {
	
	
	@Autowired
	private ServingsRepository servingsRepository;

	
	@Transactional
	public Servings save(Servings servings) {
		
		servingsRepository.save(servings);
		return servings;
	}

}
