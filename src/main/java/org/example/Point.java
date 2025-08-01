package org.example;

public class Point {
     private Integer x;
     private Integer y;

     public Point ( int x, int y){
        this.x = x;
        this.y = y;
     }

     public Integer getX (){
         return this.x ;
     }

     public Integer getY (){
         return this.y ;
     }

     public void setX ( int x ){
         this.x = x;
     }

     public void setY ( int y ){
         this.y = y ;
     }

     @Override
     public String toString(){
         return " { " + x + " ; " + y + " } ";
     }
}
