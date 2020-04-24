package com.zoopark;

public class lion extends Carnivorous{
    lion(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order ,age);
    }

    @Override
    void talk() {
        System.out.println("RRRRRrrrrrrrr");
    }


}
