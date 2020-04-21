package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        while (!input.hasNextDouble()) {
            System.out.println("Error: You have entered an invalid number!");
            System.out.println("Enter valid number for radius:");
            input.next();
        }

        double radius = input.nextDouble();
        double pi = 3.14;

//        double area = pi * radius * radius;
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
