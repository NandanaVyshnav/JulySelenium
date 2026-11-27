package assignment;

import java.util.Scanner;

public class Basic9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int p = sc.nextInt();

        System.out.print("Input the second number: ");
        int q = sc.nextInt();

        System.out.print("Input the third number: ");
        int r = sc.nextInt();

        boolean result = ((p + q) == r || (q + r) == p || (r + p) == q);

        System.out.println("The result is: " + result);

    }
}
