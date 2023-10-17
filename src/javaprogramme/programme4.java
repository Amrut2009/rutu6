package javaprogramme;
//*4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.*/Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.//

//Declare two instance and two static variables.
public class programme4 {
    int a = 10;
    String name = "rutu";
    static int c = 30;
    static int d = 40;

    // Declare one instance method.
    public void method1() {
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);
        System.out.println(d);
    }

    // Declare one static method.
    public static void method2() {
        programme4 obj = new programme4();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(c);
        System.out.println(d);
    }

    //Declare the Main method.
////4.6 Call both instance and static methods into the Main method and run the programme.*/
    public static void main(String[] args) {
        programme4 obj = new programme4();
        obj.method1();
        obj.method2();
    }
}

