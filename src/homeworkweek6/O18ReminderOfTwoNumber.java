package homeworkweek6;

import java.util.Scanner;

public class O18ReminderOfTwoNumber {

    //Main method
    public static void main(String[] args) {
//Create an obj of scanner
        Scanner obj = new Scanner(System.in);
//Print statement
        System.out.print("Input first number : ");
//Create a variable to store value
        int num1 = obj.nextInt();
//Print statement
        System.out.print("Input second number : ");
//Create a variable to store value
        int num2 = obj.nextInt();
//Obj create and call instance method into main method
        O18ReminderOfTwoNumber obj1 = new O18ReminderOfTwoNumber();
        obj1.addition(num1, num2);
        obj1.subtraction(num1, num2);
//Call static method into main method
        multi(num1, num2);
        division(num1, num2);
        reminderof2number(num1, num2);
//Close scanner
        obj.close();

    }
//Instance method

    public void addition(int num1, int num2) {
//Create a variable to store value
        int ans = num1 + num2;
//Print statement
        System.out.println("125 + 24 : " + ans);
    }

    //Instance method
    public void subtraction(int num1, int num2) {
//Create a variable to store value
        int ans = num1 - num2;
//Print statement
        System.out.println("125 - 24 : " + ans);
    }

    //Static method
    public static void multi(int num1, int num2) {
//Create a variable to store value
        int ans = num1 * num2;
//Print statement
        System.out.println("125 * 24 : " + ans);
    }

    //Static method
    public static void division(int num1, int num2) {
//Create a variable to store value
        int ans = num1 / num2;
//Print statement
        System.out.println("125 / 24 : " + ans);
    }

    //Static method
    public static void reminderof2number(int num1, int num2) {
//Create a variable to store value
        int ans = num1 % num2;
//Print statement
        System.out.println("125 % 24 : " + ans);
    }


}
