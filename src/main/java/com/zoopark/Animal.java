package com.zoopark;

public abstract class Animal {
     private String name;
     private int age;
     private   String typeAnimal;
     private String order;

    Animal(String name, String typeAnimal, String order, int age){
        this.name = name;
        this.typeAnimal= typeAnimal;
        this.age = age;
        this.order = order;
    }

    abstract String eat( Food food);
    abstract String talk();

    String getName()        {return name;}
    int getAge()            {return age;}
    String getTypeAnimal()  {return typeAnimal;}
    String getOrderAnimal() {return order;}
}
