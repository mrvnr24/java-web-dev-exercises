package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your students (or ENTER to finish):");

        Integer newId;
        String newStudent;
        do {

            System.out.println("Student Name: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("Student ID: ");
                newId = input.nextInt();

                students.put(newId, newStudent);
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass Roster: ");
        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println("#" + student.getKey() + " " + student.getValue());
        }


    }
}
