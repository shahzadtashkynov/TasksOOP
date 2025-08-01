package org.example;

import java.util.Arrays;

public class Curve {
    private Point [] points;

    public Curve ( Point [] points ){
        this.points = points ;
    }

    @Override
    public String toString ( ){
        return " Curve " + Arrays.toString( this.points) ;
    }
}
