package assignment;

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: value is");
        int a = sc.nextInt();

        System.out.print("Enter b: value is ");
        int b = sc.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
