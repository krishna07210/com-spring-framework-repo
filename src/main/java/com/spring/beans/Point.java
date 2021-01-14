package com.spring.beans;

public class Point {
    int x;
    int y;

    Point() {
        System.out.println("Constructor will automatically called when bean is created");
    }

    Point(String myString, float myFloat, int myInt, double myDouble) {
        System.out.println("myString : " + myString + " myFloat : " + myFloat + " myInt : " + myInt + " myDouble : " + myDouble);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
