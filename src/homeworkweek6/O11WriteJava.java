package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to display the following pattern.
 */
public class O11WriteJava {

    //Main method
    public static void main(String[] args) {

//Create an obj of scanner
        Scanner jav = new Scanner(System.in);
//Print statement
        System.out.println("Java pattern : ");
//Call static method
        pattern();
//Close scanner
        jav.close();
    }

    //Static method
    public static void pattern() {

//Print
        System.out.println("      jjjjjjjjjjjj              aa           vv                  vv         aa             ");
        System.out.println("           jj                 aa  aa          vv                vv        aa  aa           ");
        System.out.println("           jj                aa    aa          vv              vv        aa    aa          ");
        System.out.println("           jj               aa      aa          vv            vv        aa      aa         ");
        System.out.println("           jj              aa        aa          vv          vv        aa        aa        ");
        System.out.println("           jj             aa          aa          vv        vv        aa          aa       ");
        System.out.println("           jj            aaaaaaaaaaaaaaaa          vv      vv        aaaaaaaaaaaaaaaa      ");
        System.out.println("  jj       jj           aa              aa          vv    vv        aa              aa     ");
        System.out.println("  jj       jj          aa                aa          vv  vv        aa                aa    ");
        System.out.println("  jjjjjjjjjjj         aa                  aa           vv         aa                  aa   ");


    }


}
