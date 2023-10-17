package javaprogramme;

import java.util.Scanner;

/**17. Write a Java program to convert a decimal number to binary number.

 Input Data:
 Input a Decimal Number : 5
 Expected Output

 Binary number is: 101
 *
 */

public class programme17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first binary");
        String first = sc.next();
        int f1=Integer.parseInt(first);
        int ans =f1;
        String addbinary = Integer.toBinaryString(ans);
        System.out.println("binary is " +addbinary );
        sc.close();
    }
}


