package com.company;

public class Main {

    public static void main(String[] args) {

        HomeDecor Ceramica = new Vase("Bowl", "green", "bronze", 2016, "modern", 30.5f);
        HomeDecor Ballerina = new musicalBox("manual","Pink","ceramics",2017,"oval",77);
        System.out.println(Ceramica.toString());
        System.out.println(Ballerina.toString());
    }
}