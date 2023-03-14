package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class O5Calculator {

    public static void main(String[] args) {                   // The Main method.
        Scanner obj = new Scanner(System.in);                  //Create an obj of scanner

        System.out.print("Input first number : ");             //Print statement
        double num1 = obj.nextDouble();

        System.out.print("Input second number : ");             //Print statement
        double num2 = obj.nextDouble();

//Call both instance and static methods into the Main method
        O5Calculator obj1 = new O5Calculator();
        obj1.addition(num1, num2);
        obj1.subtraction(num1, num2);
        multi(num1, num2);
        division(num1, num2);

        obj.close();                                             // Close scanner

    }

    public void addition(double num1, double num2) {                // Instance method
        double ans = num1 + num2;
        System.out.println("Addition of the number is : " + ans);

    }

    public void subtraction(double num1, double num2) {               // Instance method
        double ans = num1 - num2;
        System.out.println("subtraction of the number is : " + ans);  // Concatenation method
    }

    public static void multi(double num1, double num2) {                // Static method
        double ans = num1 * num2;
        System.out.println("multiplication of the number is : " + ans); // Concatenation method
    }

    public static void division(double num1, double num2) {             // Static method
        double ans = num1 / num2;
        System.out.println("division of the number is : " + ans);       // Concatenation method
    }
}














