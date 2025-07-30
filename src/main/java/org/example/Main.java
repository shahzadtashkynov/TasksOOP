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
//        System.out.println(wasya);
//        System.out.println(petya);

        ArraysStudent andrey = new ArraysStudent("Andrey", wasya.ratings );
        System.out.println( andrey );
        System.out.println( wasya );

        wasya.ratings [1] = 3;
        System.out.println( " After changing : "+ wasya );
        System.out.println( "After changing : " + andrey );
    }
}