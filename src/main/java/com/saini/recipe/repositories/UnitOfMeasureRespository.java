package com.saini.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.saini.recipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRespository extends CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByDescription(String description);
}
