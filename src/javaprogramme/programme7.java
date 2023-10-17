package javaprogramme;

import java.util.Scanner;

/**Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
  */
public class programme7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter temp in fahrenheit" );
        double F= scan.nextDouble();
        double c=((F -32)*5/9);
        System.out.println("tempetaure in celsius is"+c);
        scan.close();
    }


}
