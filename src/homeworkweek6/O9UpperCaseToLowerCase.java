package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class O9UpperCaseToLowerCase {

    //Main method
    public static void main(String[] args) {
        String word;
//Create an obj of scanner
        Scanner obj = new Scanner(System.in);
//Print statement
        System.out.print("Enter Uppercase String to convert : ");
        word = obj.next();

//call static method
        name(word);
//close scanner
        obj.close();
    }

    //Static method
    public static void name(String word) {
// Concatenation method
        System.out.print("The Lowercase String = " + word.toLowerCase());


    }


}
