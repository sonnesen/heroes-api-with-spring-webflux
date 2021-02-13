package com.digitalinnovation.heroes.api.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.digitalinnovation.heroes.api.document.Heroes;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
