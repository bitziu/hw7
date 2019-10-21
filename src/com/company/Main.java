package com.company;

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Dog dog = new Dog ();
        printInfo(dog);
    }

    public static void printInfo(Animal obj) {
        obj.method1(12, 23, obj.getName());
        obj.method2(34, 54, obj.getName());
        obj.getAge();
        obj.getName();
        obj.getSpeed();
    }
}


