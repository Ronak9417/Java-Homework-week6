package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class O16TwoBinaryNumbers {

    //Main method
    public static void main(String[] args) {
//Create an obj of scanner
        Scanner x = new Scanner(System.in);
//Print statement
        System.out.print("Enter First Binary Number : ");
//Create a variable to store value
        String num1 = x.nextLine();
//Print statement
        System.out.print("Enter Second Binary Number : ");
//Create a variable to store value
        String num2 = x.nextLine();
//Call static method to main method
        binarynumber(num1, num2);
        x.close();
    }

    //Static method
    public static void binarynumber(String input1, String input2) {
//Create a variable to store value in an int variable
        int number3 = Integer.parseInt(input1, 2);
        int number4 = Integer.parseInt(input2, 2);
//Create variable to sum int variable
        int sum = number3 + number4;
//Create a variable to change value of sum variable into binary number
        String ans = Integer.toBinaryString(sum);
//print statement with concatenation
        System.out.println("Sum of two binary number : " + ans);

    }
}
