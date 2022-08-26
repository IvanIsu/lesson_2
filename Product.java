package com.isupov.spring.test_lesson_2;

public class Product {
    private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String print(){
        return id + " " + name + " " + cost;
    }
}
