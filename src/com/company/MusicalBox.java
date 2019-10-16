package com.company;

public class musicalBox extends HomeDecor {
    private String form;
    private int toneNumber;

      musicalBox(String type, String color, String material, int year, String form, int toneNumber) {
        super(type,color,material,year);
        this.form = form;
        this.toneNumber = toneNumber;
    }

    // Getters
    public String getForm() {
        return this.form;
    }

    public int getToneNumber() {
        return this.toneNumber;
    }


    // Setters
    public void setForm(String form) {
        this.form = form;
    }

    public void setToneNumber(int toneNumber) {
        this.toneNumber = toneNumber;
    }

    @Override
    public String toString() {
        return "MusicalBox{" +
                " type = " + getType() +
                " color = " + getColor()+
                " material = " + getMaterial()+
                " year = " + getYear ()+
                " form = " + form +
                " toneNumber = " + toneNumber +
                '}';

    }
}