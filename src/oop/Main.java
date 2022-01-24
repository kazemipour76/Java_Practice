package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  Mobile mobile1 = new Mobile();
       // mobile1.camera=13;
       // mobile1.company="samsung";
       // mobile1.model="j2016";
       // mobile1.name="galaxy j7";
       // mobile1.price=200000;

       // System.out.println("Camera is "+mobile1.camera);
       // System.out.println("company is "+mobile1.company);
       // System.out.println("model is "+mobile1.model);
       // System.out.println("name is "+mobile1.name);
       // System.out.println("price is "+mobile1.price);

        Scanner scanner = new Scanner(System.in);
        System.out.println(  "enter code");
        int code=scanner.nextInt();
        System.out.println(  "enter age");
        int age=scanner.nextInt();

        System.out.println(  "enter name");
        String name=scanner.next();
        System.out.println(  "enter family");
        String family=scanner.next();
        Person person = new Person(code,age,name,family);

        System.out.println(  "age is "+person.age);
        System.out.println( "code is "+ person.code);
        System.out.println(  "name is "+person.name);
        System.out.println( "family is "+ person.family);

    }
}

