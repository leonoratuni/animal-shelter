package com.animalshelter;

public class Animal {
private String name;
private int age;

public Animal(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        this.name = name;
        this.age = age;
    }

public String getName() {
return name;
}

public int getAge() {
return age;
}
}