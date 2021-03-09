package com.alex.heuger.jpa.first.recipe.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private RecipeRpository recipeRepository;
    private TagRepository tagRepository;

    @Autowired
    public RecipeService(RecipeRpository recipeRpository, TagRepository tagRepository) {
        this.recipeRepository = recipeRpository;
        this.tagRepository = tagRepository;
    }

    public void addRecipe(Recipe recipe) {
        tagRepository.saveAll(recipe.getTags());
        recipeRepository.save(recipe);
    }

    public List<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }

}
