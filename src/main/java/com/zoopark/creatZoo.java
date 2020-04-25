package com.zoopark;

class creatZoo {
    public static void main(String[] args) {
        lion leva1 = new lion("leva1", "Carnivorous", "leon", 4);
        lion leva2 = new lion("leva2", "Carnivorous", "leon", 5);
        tiger tiger1 = new tiger("tiger1", "Carnivorous", "tiger", 14);
        tiger tiger2 = new tiger("tiger2", "Carnivorous", "tiger", 6);

        zebra zebra1 = new zebra("zebra1", "Herbivorous", "zebra", 10);
        zebra zebra2 = new zebra("zebra2", "Herbivorous", "zebra", 5);
        jiraffe jiraffe1 = new jiraffe("jiraffe1", "Herbivorous", "jiraffe", 15);
        jiraffe jiraffe2 = new jiraffe("jiraffe2", "Herbivorous", "jiraffe", 16);

        foodBeef foodBeef = new foodBeef("beef","Carnivorous");
        foodMeat foodMeat = new foodMeat("meat", "Carnivorous");
        foodGrass foodGrass = new foodGrass("grass","Herbivorous");
        foodLeaves foodLeaves = new foodLeaves("leaves", "Herbivorous");


        Zoopark myZoo = new Enclosure(5);
        myZoo.addAnimal(leva1);
        myZoo.addAnimal(leva2);
        myZoo.addAnimal(tiger1);
        myZoo.addAnimal(tiger2);
        myZoo.addAnimal(zebra1);
        myZoo.addAnimal(zebra2);
        myZoo.addAnimal(jiraffe1);
        myZoo.addAnimal(jiraffe2);

        myZoo.removeAnimal(leva2);

        myZoo.feedAnimal(leva1,foodBeef);

        //myZoo.showAll();

        //myZoo.talkAll();

        //new lion("Федя","Carnivorous", 5);
        // System.out.println(leva);
        //  HashMap
    }
}
