package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Servings;

@Repository("servingsRepository")
public interface ServingsRepository extends JpaRepository<Servings, Long> {

	/*Servings save(Servings servings);*/
}
