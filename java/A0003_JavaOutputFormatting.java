package com.phjethva.hackerrankpractice.java;
//Problem Link:
//https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class A0003_JavaOutputFormatting {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
    }

}
