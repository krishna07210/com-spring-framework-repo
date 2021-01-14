package com.spring.beans;

public class Animal {
    private double weight;
    private float height;
    private String speciesName;
    private Color color;

    public Animal() {
    }

    public Animal(Color color) {
        System.out.println("Constructor is created");
        this.color = color;
    }

    public Animal(double weight, float height, String speciesName, Color color) {
        this.weight = weight;
        this.height = height;
        this.speciesName = speciesName;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
