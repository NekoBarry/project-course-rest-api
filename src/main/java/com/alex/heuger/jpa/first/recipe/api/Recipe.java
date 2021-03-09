package com.alex.heuger.jpa.first.recipe.api;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @SequenceGenerator(name = "id_sequence", allocationSize = 1, sequenceName = "id_sequence")
    @GeneratedValue(generator = "id_sequence", strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "TAG_ID", referencedColumnName = "ID")
    private List<Tag> tags;
//    private List<Ingredient> ingredients;

    public Recipe() {
    }


    public Recipe(long id, String name, List<Tag> tags) {
        this.id = id;
        this.name = name;
        this.tags = tags;
    }

    public Recipe(String name, List<Tag> tags) {
        this.name = name;
        this.tags = tags;
//        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

//    public List<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<Ingredient> ingredients) {
//        this.ingredients = ingredients;
//    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tags=" + tags +
                '}';
    }
}
