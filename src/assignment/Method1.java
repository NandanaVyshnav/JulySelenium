package assignment;

import java.util.Scanner;

public class Method1 {
	public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String temp;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

