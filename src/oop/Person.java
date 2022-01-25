package oop;

public class Person {


    public Person(){

    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    private int age;
    private String name;
    private String family;

}
