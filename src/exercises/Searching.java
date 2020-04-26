package exercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Searching {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        String upperCaseSentence = sentence.toUpperCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Type a word to search:");
        String term = input.nextLine();
        String upperCaseTerm = term.toUpperCase();

        int intIndex = upperCaseSentence.indexOf(upperCaseTerm);

        if(intIndex == - 1) {
            System.out.println("Search term not found");
        } else {
            System.out.println("Search term found at index " + intIndex);
        }

    }
}
