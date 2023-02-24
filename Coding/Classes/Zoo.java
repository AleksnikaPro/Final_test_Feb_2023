package Classes;

import GUI.AnimalCreator;
import GUI.AnimalParamCreator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> zoo;

    public Zoo() {
        this.zoo = new ArrayList<Animal>();
    }

    public void addAnimal(String type) throws IOException {
        AnimalParamCreator paramCreator = new AnimalParamCreator();
        AnimalCreator creator = new AnimalCreator(paramCreator);
        switch (type) {
            case ("Cat") -> this.zoo.add(creator.getCat());
            case ("Dog") -> this.zoo.add(creator.getDog());
            case ("Hamster") -> this.zoo.add(creator.getHamster());
            case ("Horse") -> this.zoo.add(creator.getHorse());
            case ("Camel") -> this.zoo.add(creator.getCamel());
            case ("Donkey") -> this.zoo.add(creator.getDonkey());

        }

    }

    public void allVoice() {
        for (Animal animal : this.zoo) {
            animal.voice();
        }
    }
    public void allEat() {
        for (Animal animal : this.zoo) {
            animal.eat();
        }
    }
    public void allSleep() {
        for (Animal animal : this.zoo) {
            animal.sleep();
        }
    }

    public void allSpecialMethod() {
        for (Animal animal : this.zoo) {
            animal.specialMethod();
        }
    }

    public void tre(String name){
        for (Animal animal : this.zoo) {
            if(name.equals(animal.getName())){
                animal.training();
            }
        }
    }



    @Override
    public String toString() {
        return "Zoo{" +
                "zoo=" + zoo +
                '}';
    }
}