package org.example;

import java.util.Arrays;

public class ArraysStudent {
    private String name;
    private Integer [] ratings = { };

    public ArraysStudent(String name, Integer [] ratings){
        this.name = name;
        this.ratings = ratings;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "ArraysStudent {" +
                "name = '" + name + '\'' +
                ", ratings = " + Arrays.toString(ratings) +
                '}';
    }
}
