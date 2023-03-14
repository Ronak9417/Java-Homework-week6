package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class O8AreaOfTriangle {

    //Main method
    public static void main(String[] args) {
//Create an obj of scanner
        Scanner obj = new Scanner(System.in);
//Print statement
        System.out.println("Enter the width of the Triangle:");
        double base = obj.nextDouble();
//Print statement
        System.out.println("Enter the height of the Triangle:");
        double height = obj.nextDouble();
//Call static method
        Triangle(base, height);
//Close scanner
        obj.close();
    }

//Static method
    public static void Triangle(double base, double height) {
//Define formula for area of triangle
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);
    }


}
