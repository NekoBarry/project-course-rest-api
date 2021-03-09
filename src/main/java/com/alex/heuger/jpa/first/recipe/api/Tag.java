package com.alex.heuger.jpa.first.recipe.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Tag {

    @Id
    @SequenceGenerator(name = "id_sequence", allocationSize = 1, sequenceName = "id_sequence")
    @GeneratedValue(generator = "id_sequence")
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    public Tag(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
