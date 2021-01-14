package com.spring.beans;

public class Color {
    private String colorName;
    private int colorId;

    public Color() {

    }

    public Color(String colorName, int colorId) {
        this.colorName = colorName;
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }
}
