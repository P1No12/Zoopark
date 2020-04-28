package com.zoopark;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Enclosure implements Zoopark {
    //Вольеры
   private final int sizePred;
    private final int sizeHerb;
    ArrayList<Animal> enclosureHerbivorous = new ArrayList<>();
    ArrayList<Animal> enclousureCarnivorous = new ArrayList<>();


    Enclosure(int size){
        this.sizePred = size;
        this.sizeHerb = size;
    }

    Enclosure(int sizeP, int sizeH){
        this.sizePred = sizeP;
        this.sizeHerb = sizeH;
    }



    @Override
    public void addAnimal(Animal a){
        if (a.getTypeAnimal().equals("Herbivorous")) {
            if (enclosureHerbivorous.size() < sizeHerb) {
                enclosureHerbivorous.add(a);
                System.out.println(a.getName()+" травоядное добавлено в вальер");
            } else  System.out.println("Вольер травоядных полон");
        }else if (a.getTypeAnimal().equals("Carnivorous")) {
                if (enclousureCarnivorous.size() < sizeHerb) {
                enclousureCarnivorous.add(a);
                System.out.println(a.getName()+" хищник добавлен в вальер");
            } else System.out.println("Вольер хищников полон");
        }
    }


    @Override //показать содержимое вольеров
    public void showAll(){
        System.out.println("Травоядные животные в вольере");
        for(Animal animal: enclosureHerbivorous){
            System.out.println(animal.getName()+" "+animal.getTypeAnimal()+" "+animal.getOrderAnimal()+" "+animal.getAge());
        }
        System.out.println("Плотоядные животные в вольере");
        for(Animal animal: enclousureCarnivorous){
            System.out.println(animal.getName()+" "+animal.getTypeAnimal()+" "+animal.getOrderAnimal()+" "+animal.getAge());
        }
    }

    @Override   //удаление животного по имени
    public void removeAnimal(Animal a){
        if (a.getTypeAnimal().equals("Herbivorous"))
            enclosureHerbivorous.removeIf((Animal animal) -> animal.getName().equals(a.getName()));
        if (a.getTypeAnimal().equals("Carnivorous")){
            enclousureCarnivorous.removeIf((Animal animal) -> animal.getName().equals(a.getName()));
        }
        System.out.println("После удаления:");
        showAll();

    }
    @Override //голосовая команда для всех
    public void talkAll(){
        System.out.println("Травоядные животные в вольере");
        for(Animal animal: enclosureHerbivorous) System.out.println(animal.getName()+": "+animal.talk());
        System.out.println("Плотоядные животные в вольере");
        for(Animal animal: enclousureCarnivorous){ System.out.println(animal.getName()+": "+animal.talk());
        }
    }

    @Override //накормить животное если тип животного совападает с типом еды
    public void feedAnimal(Animal a, Food food) {
        if (a.getTypeAnimal().equals(food.typeFood)){
            System.out.println(a.getName()+" накормлен");
        } else
        {
            System.out.println("не правильно выбрана еда для "+a.getName());
        }
    }

    @Override// В каком вольере животное
    public void animalInTheEnclosure(Animal a)  {
        if (enclousureCarnivorous.contains(a)) {
             System.out.println("Животное в вольере для плотоядных");
        } else if (enclosureHerbivorous.contains(a)) {
             System.out.println("Животное в вольере для травоядных");
        } else System.out.println("Животное не вольере");


    }
}
