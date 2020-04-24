package com.zoopark;

public class zebra extends Herbivore{
    zebra(String name, String typeAnimal, int age) {
        super(name, typeAnimal, age);
    }

    @Override
    String getTypeAnimal() {
        return typeAnimal;
    }
}
