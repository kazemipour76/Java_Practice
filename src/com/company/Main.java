package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().toUpperCase();

        System.out.println("lastName");
        String lastName = scanner.nextLine().toUpperCase();

        System.out.println("nationalCode");
        String nationalCode = scanner.nextLine();

       System.out.println("age");
       String age = scanner.nextLine();

        int newAge= Integer.parseInt(age);
        //System.out.println(newAge+2);

       // String agenew = String.valueOf(age);
       // System.out.println(agenew+2);
        int newCode =Integer.parseInt(nationalCode);

        System.out.println(" your name is " +name  + "and your lastName is "+ lastName +  "and your age is " + age +  " and newAge+2 "+ newAge+2 +  " and newCode "+ newCode) ;
    }
}

