package com.zoopark;

public class tiger extends Carnivorous{
    tiger(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order, age);
    }

    @Override
    void talk() {
        System.out.println("ARRrRrrrrr");
    }
}
