package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class O15SwapTwoVariables {

    //Main method
    public static void main(String[] args) {

//Create an obj of scanner
        Scanner x = new Scanner(System.in);
//Print statement
        System.out.print("Enter the value of a : ");
//Create a variable to store value
        int a = x.nextInt();
//Print statement
        System.out.print("Enter the value of b : ");
//Create a variable to store value
        int b = x.nextInt();
//obj
        O15SwapTwoVariables obj = new O15SwapTwoVariables();
//Call instance method
        obj.swapnumber(a, b);
//Close scanner
        x.close();

    }

    //Instance method
    public void swapnumber(int a, int b) {
        int c = a;
        a = b;
        b = c;
//print swap number statement with concatenation
        System.out.print("The value of a after swap : " + a);
        System.out.print("The value of b after swap : " + b);

    }

}
