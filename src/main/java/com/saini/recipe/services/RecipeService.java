package com.saini.recipe.services;

import java.util.Set;

import com.saini.recipe.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
	
}
