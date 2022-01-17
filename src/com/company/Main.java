package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("for + enter 1");
        System.out.println("for - enter 2");
        System.out.println("for * enter 3");
        System.out.println("for / enter 4");

        int x ;
        int y ;

        while (true) {
            System.out.println("enter action");
            int ans = scanner.nextInt();
            switch (ans) {
                case 1:
                    System.out.println("enter number1");
                    x=scanner.nextInt();
                    System.out.println("enter number1");
                    y=scanner.nextInt();
                    x = x + y;
                    System.out.println("ans is " + x);
                    break;
                case 2:
                    System.out.println("enter number1");
                    x=scanner.nextInt();
                    System.out.println("enter number1");
                    y=scanner.nextInt();
                    x = x - y;
                    System.out.println("ans is " + x);
                    break;
                case 3:
                    System.out.println("enter number1");
                    x=scanner.nextInt();
                    System.out.println("enter number1");
                    y=scanner.nextInt();
                    x = x * y;
                    System.out.println("ans is " + x);
                    break;

                case 4:
                    System.out.println("enter number1");
                    x=scanner.nextInt();
                    System.out.println("enter number1");
                    y=scanner.nextInt();
                    x = x / y;
                    System.out.println("ans is " + x);
                    break;
            }
        }

    }
}

