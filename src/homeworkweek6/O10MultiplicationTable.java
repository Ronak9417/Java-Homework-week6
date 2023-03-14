package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class O10MultiplicationTable {

    //Main method
    public static void main(String[] args) {

//Create an obj of scanner
        Scanner table = new Scanner(System.in);
//Print statement
        System.out.print("Input a number: ");
        int num1 = table.nextInt();
//Call static method
        table1(num1);
//Close scanner
        table.close();
    }

    //Static method
    public static void table1(int num1) {
        System.out.println(num1 + " X 1 = " + num1 * 1);
        System.out.println(num1 + " X 2 = " + num1 * 2);
        System.out.println(num1 + " X 3 = " + num1 * 3);
        System.out.println(num1 + " X 4 = " + num1 * 4);
        System.out.println(num1 + " X 5 = " + num1 * 5);
        System.out.println(num1 + " X 6 = " + num1 * 6);
        System.out.println(num1 + " X 7 = " + num1 * 7);
        System.out.println(num1 + " X 8 = " + num1 * 8);
        System.out.println(num1 + " X 9 = " + num1 * 9);
        System.out.println(num1 + " X 10 = " + num1 * 10);


    }
}
