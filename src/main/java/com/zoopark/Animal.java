package com.zoopark;

public abstract class Animal {
     private String name;
     private int age;
     private   String typeAnimal;
     private String order;

    Animal(String name, String typeAnimal, String order, int age){
        this.name = name;
        this.typeAnimal= typeAnimal;
        this.age = age;
        this.order = order;
    }

    abstract void eat();
    abstract void talk();

    String getTypeAnimal(){
        return typeAnimal;
    }

    String getOrderAnimal(){
     return order;
    }
}
