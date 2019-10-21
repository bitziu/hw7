package com.company;

public abstract class Animal {

    private int age;
    private int speed;
    private String name;


    public abstract void method1(int setAge, int setSpeed, String setName);

    public abstract void method2(int setAge, int setSpeed, String setName);


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

}
