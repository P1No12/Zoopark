package com.zoopark;

public abstract class Food {
    String typeFood;
    String nameFood;

    Food(String nameFood, String typeFood){
        this.nameFood = nameFood;
        this.typeFood = typeFood;
    }

    String getNameFood() {return nameFood;}

    abstract String getTypeFood();
}
