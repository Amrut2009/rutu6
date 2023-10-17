package javaprogramme;
//**Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)/

import java.util.Scanner;

public class programme5 {
    static int firstnumber;
    static int secondnumber;

    public static void main(String[] args) {
        programme5 obj = new programme5();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st first number");
        firstnumber = sc.nextInt();
        System.out.println("enter second number");
        secondnumber = sc.nextInt();
        obj.addition();
        obj.subtraction();
        multipication();
        division();


    }

    public void addition() {
        int addition= firstnumber + secondnumber;

        System.out.println("addition of " + firstnumber + "and" + secondnumber + "=" +addition);
    }

    public void subtraction() {
        int subtraction = firstnumber - secondnumber;
        System.out.println("subtraction of" + firstnumber + "and" + secondnumber + "=" + subtraction);

    }

    public static void multipication() {
        int multipication = firstnumber * secondnumber;
        System.out.println("multipication of" + firstnumber + "and" + secondnumber + "=" + multipication);


    }

    public static void division() {
        int division = firstnumber / secondnumber;
        System.out.println("division of" + firstnumber + "and" + secondnumber + "=" + division);
    }

}
