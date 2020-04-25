package com.zoopark;

public abstract class FoodCarnivorous extends Food {


    FoodCarnivorous(String nameFood, String typeFood) {
        super(nameFood, typeFood);
    }

    @Override
    String getTypeFood(){
        return typeFood;
    }

}
