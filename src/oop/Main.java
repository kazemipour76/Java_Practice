package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> personArrayList = new ArrayList<>();


        while (true) {
            System.out.println("add user enter number 1");
            System.out.println("search user enter number 2");
            System.out.println("show all user enter number 3");
            System.out.println("exit enter number 4");
            int ans = scanner.nextInt();
            switch (ans) {
                case 1:
                    Person person = new Person();
                    System.out.println("enter user name");
                    person.setName(scanner.next());
                    System.out.println("enter user family");
                    person.setFamily(scanner.next());
                    System.out.println("enter user age");
                    person.setAge(scanner.nextInt());
                    personArrayList.add(person);
                    break;
                case 2:
                    System.out.println("enter user name for search");
                    String name = scanner.next();
                    System.out.println("enter user family for search");
                    String family = scanner.next();

                    for (Person person1 : personArrayList) {
                        if (person1.getName().equals(name) || person1.getFamily().equals(family)) {
                            System.out.println("found " + person1.getName() + " " + person1.getFamily());
                        } else {
                            System.out.println("not found in " + person1.getName() + " " + person1.getFamily());
                        }
                    }
                    break;
                case 3:
                    for (Person person1 : personArrayList) {
                        System.out.println("user name is " + person1.getName());
                        System.out.println("user family is" + person1.getFamily());
                        System.out.println("user age is " + person1.getAge());
                        System.out.println("____________________________________");

                    }
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("is default1");

            }
        }


    }
}

