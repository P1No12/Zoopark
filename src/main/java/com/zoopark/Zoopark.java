package com.zoopark;


interface Zoopark {

        void addAnimal(Animal a);// добавить животное в вольер
        void showAll(); //показать содержимое
        void removeAnimal(Animal a);//удалить животное
        void talkAll();//Говорить
        void feedAnimal(Animal a, Food food);// накормить животное
        void animalInTheEnclosure(Animal a);//проверка животное в вольере или нет
}

