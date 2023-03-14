package homeworkweek6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class O3OneInstanceAndOneStaticVariable {
    //Declare one instance and one static variable.
    static int a = 4;
    int b = 3;

    //Declare the Main method
    public static void main(String[] args) {
        O3OneInstanceAndOneStaticVariable obj = new O3OneInstanceAndOneStaticVariable();
        obj.myMethod();//Call both instance and static methods into the Main method
        yourMethod();
    }

    //Declare one instance method.
    public void myMethod() {
        System.out.println("Instance method");
        System.out.println(a);
        System.out.println(b);//Call both instance and static variables into both instance and static methods inside the
        //print statement.
    }


    // Declare one static method.
    public static void yourMethod() {
        O3OneInstanceAndOneStaticVariable obj = new O3OneInstanceAndOneStaticVariable();
        System.out.println("Static Method");
        System.out.println(a);
        System.out.println(obj.b);//Call both instance and static variables into both instance and static methods inside the
        //print statement.

    }
}
