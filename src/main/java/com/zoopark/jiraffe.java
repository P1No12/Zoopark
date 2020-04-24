package com.zoopark;

public class jiraffe extends Herbivore{
    jiraffe(String name, String typeAnimal, int age) {
        super(name, typeAnimal, age);
    }

    @Override
    String getTypeAnimal() {
        return typeAnimal;
    }
}
