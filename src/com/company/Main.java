package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double x =scanner.nextDouble();
         double y =scanner.nextDouble();
         double z =scanner.nextDouble();
         double w =scanner.nextDouble();
         double t =scanner.nextDouble();

         double ans = ((x+6)*y)*(z/(t+4))/(w*(t-4))+(x-t);

         System.out.println(ans);
    }
}

