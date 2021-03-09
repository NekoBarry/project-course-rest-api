package com.alex.heuger.jpa.first.recipe.api;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @SequenceGenerator( sequenceName = "id_sequence", allocationSize = 1, name = "id_sequence")
    @GeneratedValue( generator = "id_sequence")
    private long id;
    private String name;
    private int amount;

    public Ingredient() {
    }

    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
