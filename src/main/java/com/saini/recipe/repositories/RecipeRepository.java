package com.saini.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saini.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
