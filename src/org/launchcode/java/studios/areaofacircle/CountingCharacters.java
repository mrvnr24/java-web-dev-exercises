package org.launchcode.java.studios.areaofacircle;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingCharacters {
    public static void main (String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        String[] letter = quote.split("");

        ArrayList<String> letters = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (int i=0; i<quote.length(); i++) {
            if (!letters.contains(letter[i])) {
                letters.add(letter[i]);
            }
        }

        System.out.println(letters);


    }

}
