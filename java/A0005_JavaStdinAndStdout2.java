package com.phjethva.hackerrankpractice.java;
//Problem Link:
//https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class A0005_JavaStdinAndStdout2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scanner.close();
    }

}
