package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class O7Temperaturevalue {

    //Main method
    public static void main(String[] Strings) {

//Create an obj of scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
//call static method
        temp(fahrenheit);
//close scanner
        input.close();
    }

    //static method
    public static void temp(double fahrenheit) {
//Define variable to formula
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }

}
