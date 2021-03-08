/*
 Create a class with 3 member fields: double radius,
 double x, double y

 Eight methods
 - 6 are get/set for x, y, radius
 - getArea that returns area from radius
 - doesOverlap accepts a Circle and returns true
   if it overlaps the circle that the method was
   invoked on
 - 2 circles overlap if the sum of their radius'
   is greater than or equal to the distance between
   their centers
 */

package CircleClass;
import java.util.Scanner;

public class Circle {

    private double X;
    private double Y;
    private double radius;
    double area;

    public void setX(double inputValue) {      // Mutator
        X = inputValue;
    }
    public void setY(double inputValue) {      // Mutator
        Y = inputValue;
    }
    public void setRadius(double inputValue) {      // Mutator
        radius = inputValue;
    }
    public double getX() {                     // Accessor
        return X;
    }
    public double getY() {                     // Accessor
        return Y;
    }
    public double getRadius() {                     // Accessor
        return radius;
    }
    public double getArea() {                     // Accessor
        area = radius * radius * Math.PI;
        return area;
    }
    public boolean doesOverlap(Circle otherCircle) {
        double distanceBetweenCenters;
        double xDiff;
        double yDiff;
        double radiusSum;

        // get distance between circle centers & sum of radius
        xDiff = Math.abs(this.getX() - otherCircle.getX());
        yDiff = Math.abs(this.getY() - otherCircle.getY());
        distanceBetweenCenters = (double) Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
        radiusSum = this.getRadius() + otherCircle.getRadius();

        // check if overlap
        if (radiusSum > distanceBetweenCenters) {
            return true;
        }
        else {
            return false;
        }
    }

}
