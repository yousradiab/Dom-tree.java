package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        HTag hTag = new HTag();
        hTag.setNumber(1);
        hTag.setText("jeg er et h tag");

        System.out.println(hTag);
    }
}