package homeworkweek6;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class O1InstanceVariables {
    // two instance variables.
    int a = 10;
    int b = 20;

    // the Main method.
    public static void main(String[] args) {

        O1InstanceVariables obj = new O1InstanceVariables();
        //instance method into the Main method and Run the programme.
        obj.myMethod();

    }

    public void myMethod() {
        //Call both instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(b);
    }

}
