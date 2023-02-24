package GUI;

import Classes.*;

import java.io.IOException;

public class AnimalCreator {
    private AnimalParamCreator paramCreator;

    public AnimalCreator(AnimalParamCreator paramCreator) {
        this.paramCreator = paramCreator;
    }


    public Cat getCat() throws IOException {
        Cat cat = new Cat(this.paramCreator.getName("Cat"),this.paramCreator.getBirthday("Cat"));
        return cat;
    }

    public Dog getDog() throws IOException {
        Dog dog = new Dog(this.paramCreator.getName("Dog"),this.paramCreator.getBirthday("Dog"));
        return dog;
    }

    public Camel getCamel() throws IOException {
        Camel camel = new Camel(this.paramCreator.getName("Camel"),this.paramCreator.getBirthday("Camel"));
        return camel;
    }

    public Donkey getDonkey() throws IOException {
        Donkey donkey = new Donkey(this.paramCreator.getName("Donkey"),this.paramCreator.getBirthday("Donkey"));
        return donkey;
    }

    public Hamster getHamster() throws IOException {
        Hamster hamster = new Hamster(this.paramCreator.getName("Hamster"),this.paramCreator.getBirthday("Hamster"));
        return hamster;
    }

    public Horse getHorse() throws IOException {
        Horse horse = new Horse(this.paramCreator.getName("Horse"),this.paramCreator.getBirthday("Horse"));
        return horse;
    }
}