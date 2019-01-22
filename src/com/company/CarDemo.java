package com.company;

public class CarDemo {

    public static void main(String[] args) {

    Car myCar = new Car();

     myCar.setColor("Black");
     myCar.setMake("Ford");
     myCar.setModel("Escape");

     System.out.println("My car is colored " + myCar.getColor());
     System.out.println("The make of my car is " + myCar.getMake());
     System.out.println("The model of my car is " + myCar.getModel());

    }
}
