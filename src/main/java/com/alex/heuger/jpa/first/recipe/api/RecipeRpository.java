package com.alex.heuger.jpa.first.recipe.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRpository extends JpaRepository<Recipe, Long> {
}
