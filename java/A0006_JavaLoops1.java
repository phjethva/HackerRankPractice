package com.phjethva.hackerrankpractice.java;
//Problem Link:
//https://www.hackerrank.com/challenges/java-loops-i/problem

import java.util.Scanner;

public class A0006_JavaLoops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = 1;
        while (b <= 10) {
            System.out.println(a + " x " + b + " = " + (a * b));
            b++;
        }
        scanner.close();
    }

}
