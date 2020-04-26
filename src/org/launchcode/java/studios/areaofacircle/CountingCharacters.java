package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main (String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteArray = quote.toCharArray();

        HashMap<Character, Integer> countLetters = new HashMap<>();
        for (char c : quoteArray) {
            if (countLetters.containsKey(c)) {
                countLetters.put(c, countLetters.get(c)+1);
            } else {
                countLetters.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countLetters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }

}
