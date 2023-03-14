package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class O6RadiusValueOfTheCircle {

    //The Main method.
    public static void main(String[] args) {

        int r;
        System.out.println("Enter radius value of the circle");

//Create an obj of scanner
        Scanner doc = new Scanner(System.in);
        r = doc.nextInt();
//Call static method.
        circle(r);

//Close scanner
        doc.close();

    }

    // Static method
    public static void circle(int r) {
//Define variable to formula
        final double PI = 3.14;
        double area = PI * r * r;
        System.out.println("Area of circle : " + area);
    }

}
