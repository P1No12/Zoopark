package com.zoopark;

public class zebra extends Herbivore{
    zebra(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order ,age);
    }

    @Override
    String talk() {
        return "what say zebra?";
    }


}
