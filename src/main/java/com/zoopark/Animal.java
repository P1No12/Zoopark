package com.zoopark;

public abstract class Animal {
    String name;
    int age;
    String typeAnimal;

    Animal(String name, String typeAnimal, int age){
        this.name = name;
        this.typeAnimal= typeAnimal;
        this.age = age;
    }

    abstract void eat();
    abstract void talk();
    abstract String getTypeAnimal();
}
