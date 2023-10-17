package javaprogramme;

import java.util.Scanner;

//15. Write a Java program to swap two variables./
public class programme15 {
    public void swapVariable(int a, int b) {
        System.out.println();
        int temp = 0;
        a = temp;
        
        a = b;
        b = temp;
        System.out.println("a=b,b=a");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first variable ");
        int firstVariable = scan.nextInt();
        System.out.println("enter second variable ");
        int secondVariable = scan.nextInt();
        programme15 obj = new programme15();
        obj.swapVariable(firstVariable, secondVariable);
        scan.close();
    }
}


