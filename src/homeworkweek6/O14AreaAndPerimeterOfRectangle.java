package homeworkweek6;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class O14AreaAndPerimeterOfRectangle {

    //Main method
    public static void main(String[] args) {
//Create an obj of scanner
        Scanner obj = new Scanner(System.in);
//Print statement
        System.out.print("Enter the width of the rectangle : ");
//Create a variable to store value
        double width = obj.nextDouble();
//Print statement
        System.out.print("Enter the height of the rectangle : ");
//Create a variable to store value
        double height = obj.nextDouble();
//Call static method
        rectangle(width, height);
//Close scanner
        obj.close();
    }

    //Static method
    public static void rectangle(double width, double height) {
//Create to variable to store value of area and perimeter of a rectangle
        double area = (width * height);
        double Perimeter = 2 * (width + height);
//print statement with concatenation
        System.out.println("Area of rectangle is: " + area);
        System.out.println("Area of rectangle is: " + Perimeter);
    }


}




