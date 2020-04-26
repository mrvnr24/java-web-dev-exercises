package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
            num.add(2);
            num.add(7);
            num.add(12);
            num.add(17);
            num.add(20);
            num.add(22);
            num.add(32);
            num.add(43);
            num.add(56);
            num.add(67);

            int sum = 0;

            for (int i=0; i<num.size(); i++) {
                if(num.get(i) % 2 == 0) {
                    sum += num.get(i);
                }
            }
        System.out.println(sum);

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the word length:");
            int wordLength = input.nextInt();

        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("pineapple");
        words.add("mango");
        words.add("orange");
        words.add("pear");
        words.add("melon");

        for (String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }


    }
}
