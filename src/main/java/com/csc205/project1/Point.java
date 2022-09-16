package com.csc205.project1;
/*
Seanae Moriarty
CSC205 11342
Project: Lets Get to the Point
*/

public class Point {

    private double x;
    private double y;

    //constructor
    public Point(){
        x = 0;
        y = 0;
    }
    //overload
    public Point(double newX, double newY){
        setPoint(newX, newY);
    }

    //x and y getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //x and y setters
    void setX(double newX){
        x = newX;
    }


    void setY(double newY){
         y = newY;
    }

    //Set x and y
    public void setPoint(double newX, double newY) {
        x = newX;
        y = newY;
    }

    //calculate the distance between two points
    public double distance(Point p2){
        return Math.sqrt((p2.x-x)*(p2.x-x)+(p2.y-y)*(p2.y-y));
    }

    public void shiftX(double n) {
        x = x+n;
    }

    public void shiftY(double n) {
        y = y+n;
    }

    public void rotate(double angle) {

        double x1 = x;
        double y1 = y;

        x = (x1 * Math.cos(angle)) - (y1 * Math.sin(angle));
        y = (x1 * Math.sin(angle)) + (y1 * Math.cos(angle));

    }

        @Override
    public String toString() {
        return "Point{x = " + String.valueOf(x) + ", y = " + String.valueOf(y) + "}";
    }

}
