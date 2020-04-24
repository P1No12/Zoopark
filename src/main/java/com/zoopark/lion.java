package com.zoopark;

public class lion extends Carnivorous{
    lion(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order ,age);
    }

    @Override
    String talk() {
        return "RRRRRrrrrrrrr";
    }


}
