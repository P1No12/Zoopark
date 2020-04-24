package com.zoopark;

abstract public class Carnivorous  extends Animal{
    Carnivorous(String name, String typeAnimal, int age) {
        super(name, typeAnimal, age);


    }
    @Override
    void eat() {
        System.out.print("Eat MEAT");

    }
    @Override
    void talk() {

    }

    @Override
    String getTypeAnimal() {
        return typeAnimal;
    }

}
