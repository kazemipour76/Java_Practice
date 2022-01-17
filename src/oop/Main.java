package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.camera=13;
        mobile1.company="samsung";
        mobile1.model="j2016";
        mobile1.name="galaxy j7";
        mobile1.price=200000;

        System.out.println("Camera is "+mobile1.camera);
        System.out.println("company is "+mobile1.company);
        System.out.println("model is "+mobile1.model);
        System.out.println("name is "+mobile1.name);
        System.out.println("price is "+mobile1.price);



        Mobile mobile2 = new Mobile();
        mobile2.camera=13;
        mobile2.company="samsung";
        mobile2.model="j2016";
        mobile2.name="galaxy j7";
        mobile2.price=200000;

        System.out.println("Camera is "+mobile2.camera);
        System.out.println("company is "+mobile2.company);
        System.out.println("model is "+mobile2.model);
        System.out.println("name is "+mobile2.name);
        System.out.println("price is "+mobile2.price);
    }
}

