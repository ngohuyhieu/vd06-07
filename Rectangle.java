package com.company;

public class Rectangle {
    int width;
    int height;


    Rectangle() {
        width = 10;
        height = 10;
        System.out.println("Constructor Invoked...");
    }
    Rectangle (int wid, int heig) {
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
        System.out.println("Width: " + width);
        System.out.println("Width: " + height);
    }
    }


