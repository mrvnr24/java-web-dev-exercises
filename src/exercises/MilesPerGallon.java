package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles you have driven:");
        float miles = input.nextFloat();

        System.out.println("Enter amount of gas consumed in gallons");
        float gas = input.nextFloat();

        float milesPerGallon = miles/gas;
        System.out.println("Miles per gallon: "+ milesPerGallon);


    }
}
