package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the rectangle:");
        double length = input.nextDouble();

        System.out.println("Enter width of the rectangle:");
        double width = input.nextDouble();

        input.close();

        double areaOfRectangle = length * width;

        System.out.println("Area of rectangle is " + areaOfRectangle);
    }
}
