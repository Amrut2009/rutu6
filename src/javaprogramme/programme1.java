package javaprogramme;

/**1.1 Declare two instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.*/
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the progr
public class programme1 {
    //  Declare two instance variables.
    int a = 10;
    int b = 20;

    // Declare one instance method.
    // Call both instance variables into the instance method inside the print statement.
    public void method() {
        System.out.println(a);
        System.out.println(b);
    }

    // Call the above instance method into the Main method and Run the programme.*/
    public static void main(String[] args) {
        programme1 obj = new programme1();
        obj.method();


    }
}
