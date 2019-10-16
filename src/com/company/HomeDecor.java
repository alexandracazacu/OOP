package com.company;

public class HomeDecor {
    private String type;
    private String color;
    private String material;
    private int year;

    HomeDecor(String type, String color, String material, int year) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.year = year;

    }

    public HomeDecor(String type, String color, String material, int year) {
    }

    // Getters
    public String getType(){
        return this.type;
    }

    public String getColor(){
        return this.color;
    }

    public String getMaterial(){
        return this.material;
    }

    public int getYear(){
        return this.year;
    }

    // Setters
    public void setType(String type){
        this.type=type;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setMaterial(String material){
        this.material=material;
    }

    public void setYear(int year){
        this.year=year;
    }

}