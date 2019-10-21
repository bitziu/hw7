package com.company;

public class Horse extends Animal {
    @Override
    public String getName() {
        return super.setName("Horse");
    }

    @Override
    public void method1(int age, int speed, String name) {
        System.out.println("Age = " + age + " Speed = " + speed + " Name = " + name);
    }

    @Override
    public void method2(int age, int speed, String name) {
        System.out.println("Age = " + age + " Speed = " + speed + " Name = " + name);

    }
}