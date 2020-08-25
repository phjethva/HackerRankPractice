package com.phjethva.hackerrankpractice.java;
//Problem Link:
//https://www.hackerrank.com/challenges/java-if-else/problem

import java.util.Scanner;

public class A0008_IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && (2 <= n && n <= 5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (6 <= n && n <= 20)) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

}
