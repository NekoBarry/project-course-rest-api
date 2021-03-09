package com.alex.heuger.jpa.first.recipe.api;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping( path = "/recipe")
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeService.addRecipe(recipe);
    }

    @GetMapping( produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Recipe> getAllRecipes() {
        return recipeService.getRecipes();
    }

}
