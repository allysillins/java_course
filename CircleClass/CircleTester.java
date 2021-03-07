/*
  Test code from Circle.java
 */

package CircleClass;
import java.util.Scanner;

public class CircleTester {

    public static void main(String[] args) {

        // initialize 3 test circles
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        // create circle1
        circle1.setX(1.0);
        circle1.setY(2.0);
        circle1.setRadius(3.0);

        // create circle2
        circle2.setX(2.0);
        circle2.setY(3.0);
        circle2.setRadius(4.0);

        // create circle3
        circle3.setX(15.0);
        circle3.setY(20.0);
        circle3.setRadius(2.0);

        System.out.println("Beginning tests.");

        // two circle objects that should overlap
        if (circle1.doesOverlap(circle1, circle2)) {
            System.out.println("circles 1 and 2 overlap");
        }
        else {
            System.out.println("FAILED: circles 1 and 2 do not overlap");
        }

        // two circle objects that should not overlap
        if (circle1.doesOverlap(circle1, circle3)) {
            System.out.println("FAILED: circles 1 and 3 overlap");
        }
        else {
            System.out.println("circles 1 and 3 do not overlap");
        }
        System.out.println("Tests complete.");
    }
}