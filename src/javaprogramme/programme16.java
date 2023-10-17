package javaprogramme;

import java.util.Scanner;

/**Write a Java program to add two binary numbers.

 Input Data:
 Input first binary number: 10
 Input second binary number: 11
 Expected Output:

 Sum of two binary numbers: 101
 *
 */
public class programme16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first binary");
        String first = sc.next();
        System.out.println("input second binary");

        String second = sc.next();
        int f1=Integer.parseInt(first,2);
        int f2=Integer.parseInt(second,2);

      int ans =f1+f2;

        String addbinary = Integer.toBinaryString(ans);
        System.out.println("binary is " +addbinary );

    }
}