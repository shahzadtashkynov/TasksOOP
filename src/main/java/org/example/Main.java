package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // initializing array of ratings
        Integer [] ratings = {3, 4, 5 };

        ArraysStudent wasya = new ArraysStudent("Wasya", ratings );
        //System.out.println(wasya.getRatings());

        ArraysStudent petya = new ArraysStudent("Petya", ratings );
        //System.out.println(petya);

        petya.ratings [0] = 5;
        System.out.println(wasya);
        System.out.println(petya);


    }
}