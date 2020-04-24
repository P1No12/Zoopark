package com.zoopark;

class creatZoo {
    public static void main(String[] args) {
        lion leva = new lion("hhh", "Carnivorous", "leon", 4);
        Zoopark myZoo = new Enclosure(5);
        myZoo.addAnimal(leva);
        myZoo.talkAll();

        //new lion("Федя","Carnivorous", 5);
        // System.out.println(leva);
        //  HashMap
    }
}
