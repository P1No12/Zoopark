package com.zoopark;

public abstract class FoodHerbivore extends Food {


    FoodHerbivore(String nameFood, String typeFood) {
        super(nameFood, typeFood);
    }

    @Override
    String getTypeFood(){
        return typeFood;
    }
}
