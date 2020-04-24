package com.zoopark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enclosure implements Zoopark {
    //Вольеры
   private int sizePred, sizeHerb;
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
                System.out.println("Травоядное добавлено в вальер");
            } else  System.out.println("Вольер травоядных полон");
        }else if (a.getTypeAnimal().equals("Carnivorous")) {
                if (enclousureCarnivorous.size() < sizeHerb) {
                enclousureCarnivorous.add(a);
                System.out.println("Хищник добавлен в вальер");
            } else System.out.println("Вольер хищников полон");
        }
    }

    //показать содержимое вольеров
    @Override
    public void showAll(){
        System.out.println("Травоядные животные в вольере");
        for(Animal animal: enclosureHerbivorous){
            System.out.println(animal);
        }
        System.out.println("Плотоядные животные в вольере");
        for(Animal animal: enclousureCarnivorous){
            System.out.println(animal);
        }
    }

    @Override
    public void removeAnimal(Animal a){

    }
    @Override
    public void talkAll(){
        System.out.println("Травоядные животные в вольере");
        for(Animal animal: enclosureHerbivorous) System.out.println(animal.talk());
        System.out.println("Плотоядные животные в вольере");
        for(Animal animal: enclousureCarnivorous){ System.out.println(animal.talk());
        }
    }



}
