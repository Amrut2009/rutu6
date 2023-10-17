package javaprogramme;
//**Write a program to calculate the area of a triangle./

import java.util.Scanner;

public class programme8Tringle {
    public static void area ( int h,int b){
        int area = (h*b)/2;
        System.out.println("programme8tringle"+h+"and"+b+"is"+area);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rudius of Tringle");
        int h =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("area h,b");
        sc.close();
    }


}
