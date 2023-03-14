package homeworkweek6;
/**
 * Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.
 */

import java.util.Scanner;

public class O13ThreeNumbers {

    //Main method
    public static void main(String[] args) {

//Create an obj of scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
//Print statement
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
//Call static method
        double z = in.nextDouble();
//Close scanner
        average(x, y, z);

    }

    //Static method
    public static void average(double x, double y, double z) {
//Define formula of average number
        double a = (x + y + z) / 3;
//Print
        System.out.println("average value is : " + a);


    }

}
