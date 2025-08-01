package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point ( 1 , 5 );
        Point p2 = new Point ( 2 , 8 );
        Point p3 = new Point ( 5 , 3 );

        Point [] points = { p1, p2 , p3 };
        Curve curve1 = new Curve( points );

        System.out.println ( curve1 );
    }
}