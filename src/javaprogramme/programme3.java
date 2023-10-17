package javaprogramme;
//*3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.*/2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.//


public class programme3 {
    // Declare one instance and one static variable.
    int a = 10;
    static int b = 20;

    // Declare one instance method.
    public void method1() {
        System.out.println(a);
        System.out.println(b);

    }

    // Declare one static method.
    public static void method2() {
        programme3 obj = new programme3();
        obj.method1();
    }
    //Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.*/

    public static void main(String[] args) {
        programme3 obj = new programme3();
        obj.method2();
    }
}
