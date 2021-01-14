package com.spring.beans;

public class Animal2 {
    private String speciesName;
    private Color color;
    private Size size;
    private String validator;

    public Animal2() {
    }

    public Animal2(String speciesName, Color color, Size size) {
        this.speciesName = speciesName;
        this.color = color;
        this.size = size;
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

    public Size getSize() {
        return size;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
