package javaprogramme;

import java.util.Scanner;

//**Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
//Test Data: Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
public class programme10Multiplication {
    public static void printTable(byte number) {
        System.out.println(number + "*1" + number);
        System.out.println(number + "*2" + number * 2);
        System.out.println(number + "*3" + number * 3);
        System.out.println(number + "*4" + number * 4);
        System.out.println(number + "*5" + number * 5);
        System.out.println(number + "*6" + number * 6);
        System.out.println(number + "*7" + number * 7);
        System.out.println(number + "*8" + number * 8);
        System.out.println(number + "*9" + number * 9);
        System.out.println(number + "*10" + number * 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number:");
        byte table0f = sc.nextByte();
        printTable(table0f);

        sc.close();

    }


}









