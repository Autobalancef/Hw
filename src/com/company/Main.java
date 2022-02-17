package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Mouse").print();


    }
    public static Animal createObject(String className){
      switch (className) {
          case "Dog":
              return new Dog("Rex",5);
          case "Cat":
              return new Cat("Snow",6);
          case "Mouse":
              return new Mouse("Jerry",3);
          default:
              return null;
      }
    }
}

