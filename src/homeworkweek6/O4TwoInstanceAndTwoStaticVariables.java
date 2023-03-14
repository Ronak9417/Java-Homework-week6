package homeworkweek6;

/**
 * Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */


public class O4TwoInstanceAndTwoStaticVariables {

    int a = 10;                                         // Instance variables
    int b = 20;                                         // Instance variables
    static int x = 15;                                  // static variables
    static int y = 25;                                  // static variables

    public static void main(String[] args) {            // main method
        O4TwoInstanceAndTwoStaticVariables obj = new O4TwoInstanceAndTwoStaticVariables();
        obj.myMethod();                                 // call myMethod in main method
        yourMethod();                                   //  call static in main method
    }

    public void myMethod() {                            // instance method
        System.out.println("Instance method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

    public static void yourMethod() {                   // static method
        O4TwoInstanceAndTwoStaticVariables obj = new O4TwoInstanceAndTwoStaticVariables();
        System.out.println("Static Method");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(x);
        System.out.println(y);
    }

}