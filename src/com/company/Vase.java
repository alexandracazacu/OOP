package com.company;

public class Vase extends HomeDecor {
    private String style;
    private float height;

    Vase(String type, String color, String material, int year, String style, float height) {
        super(type, color, material, year);
        this.style = style;
        this.height = height;
    }

    // Getters
    public String getStyle() {
        return this.style;
    }

    public float getheight() {
        return this.height;
    }

    // Setters
    public void setStyle(String style) {
        this.style = style;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Vase{" +
                " type : " + getType()+
                " color : " + getColor() +
                " material : "  +getMaterial() +
                " year : " +getYear() +
                " style : " + style +
                " height :" + height +
                '}';

    }
}