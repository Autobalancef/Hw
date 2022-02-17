package com.company;

public class Mouse extends Animal{


    private int age;

    public Mouse(String name,  int age) {
        super(name);

        this.age = age;
    }




    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println("\n Name: " + getName() + "\n Age: " + getAge()
        );
    }
}

