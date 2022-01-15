package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int age = scanner.nextInt();
            if (age <= 0) {
                System.out.println("notfound");
            } else if (age >= 1 && age <= 3) {
                System.out.println("nozad");
            } else if (age > 3 && age <= 7) {
                System.out.println("khordsal");
            } else if (age > 7 && age <= 14) {
                System.out.println("nojavan");
            } else if (age > 14 && age <= 25) {
                System.out.println("javan");
            } else if (age > 25 && age <= 40) {
                System.out.println("miyansal");
            } else if (age > 40 && age <= 60) {
                System.out.println("kohansal");
            } else if (age > 60 && age <= 80) {
                System.out.println("salmand");
            } else if (age > 80 && age <= 100) {
                System.out.println("khodahafez");
            } else if (age > 100) {
                System.out.println("fosil");
            }
        }
        catch (Exception e) {
            System.out.println("try again");
        }
    }

}

