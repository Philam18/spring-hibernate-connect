package com.philam18.demohibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circle {
    @Id
    private int id;
    private String name;

    public Circle() {
    }

    public Circle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}