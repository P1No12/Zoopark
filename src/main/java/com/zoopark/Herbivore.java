package com.zoopark;

abstract class Herbivore extends Animal{

    Herbivore(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order, age);
    }
    @Override
    String eat() {
        return "eat GROSS";
    }

}
