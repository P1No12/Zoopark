package com.zoopark;

abstract class Herbivore extends Animal{

    Herbivore(String name, String typeAnimal, String order, int age) {
        super(name, typeAnimal, order, age);
    }

    @Override
    String eat(Food food) {
        if (this.getTypeAnimal().equals(food.typeFood)) {
            return "животное накормленно";
        }   else {
            return "животное не накормленно";
        }
    }

}
