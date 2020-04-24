package com.zoopark;

abstract public class Carnivorous  extends Animal{
    Carnivorous(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order, age);

    }
    @Override
    String eat() {
        return "Eat MEAT";
    }

}
