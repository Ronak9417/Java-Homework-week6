package homeworkweek6;

import java.util.Scanner;


/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */
public class O19StringIntoLowercase {

    //Main method
    public static void main(String[] args) {
        String Alfa;
//Create an obj of scanner
        Scanner obj = new Scanner(System.in);
//Print statement
        System.out.print("Enter Uppercase String to convert : ");
        Alfa = obj.nextLine();
//Call static method into main method
        name(Alfa);
//Close scanner
        obj.close();

    }

    //Static method
    public static void name(String word) {
//Print statement with concatenation
        System.out.print("The Lowercase String = " + word.toLowerCase());


    }


}
