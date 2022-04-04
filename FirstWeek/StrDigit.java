package com.company;

public class Main {

    public static void main(String[] args) {
        String str= "Epa20mJ2a2va";
        str = str.replaceAll("[^0-9]","");
        System.out.println(str);
    }
}
