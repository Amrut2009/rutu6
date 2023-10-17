package javaprogramme;

import java.util.Scanner;

/** Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5*/

public class programm18 {
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("first number");
         int a= scan.nextInt();
         System.out.println("second number");
         int b= scan.nextInt();
         int add =(a+b);
         int sub =(a-b);
         int mul =(a*b);
         int div =(a/b);
         int mod =(a%b);
         System.out.println(a+ "+" +b+ "="+add);
         System.out.println(a+ "-" +b+ "="+sub );
         System.out.println(a+ "*" +b+ "="+mul );
         System.out.println(a+ "/" +b+ "="+div );
         System.out.println(a+ "%" +b+ "="+mod );

         Scanner sc=new Scanner(System.in);
         System.out.println("first number");
         int firstnumber= sc.nextInt();
         System.out.println("second number");
         int secondnumber =sc.nextInt();
         sc.close();


     }


}
