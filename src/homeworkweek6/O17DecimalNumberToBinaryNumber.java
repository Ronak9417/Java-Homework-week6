package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output *
 * Binary number is: 101
 */

public class O17DecimalNumberToBinaryNumber {

    //Main method
    public static void main(String[] args) {
        String Alfa;
//Create an obj of scanner
        Scanner a = new Scanner(System.in);
//Print statement
        System.out.print("Enter any decimal number : ");
//Create a variable to store value
        int num = a.nextInt();
//Call static method into main method
        alfa(num);
//Close scanner
        a.close();

    }

    //Static method
    public static void alfa(int dec) {
//Create string variable to convert a decimal number to binary number
        String binary = Integer.toBinaryString(dec);
        System.out.println("Binary number is : " + binary);


    }

}
