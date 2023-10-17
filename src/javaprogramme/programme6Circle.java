package javaprogramme;
//*Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).//Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r)./

import java.util.Scanner;

public class programme6Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter rudius of circule");
        double r = scan.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("area of the circule is" + area);
        scan.close();


    }
}
