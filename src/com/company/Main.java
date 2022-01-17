package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(12);
        integers.add(20);
        integers.add(30);
        integers.add(40);

        for (int i:integers){
            System.out.println(i);
        }
        System.out.println("----------------------");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }



}

