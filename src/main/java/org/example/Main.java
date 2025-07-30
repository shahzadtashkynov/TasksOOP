package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // initializing array of ratings
        Integer [] ratings = {3, 4, 5 };

        ArraysStudent student = new ArraysStudent("Wasya", ratings );
        System.out.println(student.getRatings());

        ArraysStudent student1 = new ArraysStudent("Petya", ratings );
        System.out.println(student1);

    }
}