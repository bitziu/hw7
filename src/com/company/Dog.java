package com.company;

public class Dog extends Animal{
    @Override
    public String getName() {
        return super.setName("Dog");
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
