package com.backend.insantani.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Adrian on 3/23/2016.
 */
@Entity
public class Vegetable {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int size;

    public Vegetable(String name, int size) {

    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int Size;


}

