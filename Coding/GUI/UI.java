package GUI;

import Classes.Cat;
import Classes.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static GUI.AnimalCount.variable;

public class UI {
    private static Zoo zoo = new Zoo();


    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean isWork = true;

    private static int getOperation() throws IOException {
        System.out.println();
        System.out.println("Нажмите 1: Завести новое животное");
        System.out.println("Нажмите 2: Показать список команд, которое выполняет животное");
        System.out.println("Нажмите 3: Обучить животное новым командам");
        System.out.println("Нажмите 0: Выход из программы");
        return Integer.parseInt(reader.readLine());
    }

    private static void addAnimal() throws IOException {
        AnimalCount animalCount = new AnimalCount();
        try(animalCount) {
            animalCount.add();
            System.out.println("Добавить кота     нажмите 1");
            System.out.println("Добавить собаку   нажмите 2");
            System.out.println("Добавить хомяка   нажмите 3");
            System.out.println("Добавить лошадь   нажмите 4");
            System.out.println("Добавить верюлюда нажмите 5");
            System.out.println("Добавить осла     нажмите 6");

            switch (Integer.parseInt(reader.readLine())) {
                case (1) -> zoo.addAnimal("Cat");
                case (2) -> zoo.addAnimal("Dog");
                case (3) -> zoo.addAnimal("Hamster");
                case (4) -> zoo.addAnimal("Horse");
                case (5) -> zoo.addAnimal("Camel");
                case (6) -> zoo.addAnimal("Donkey");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void listOfCommands() throws IOException {
        System.out.println("Животные умеют: ");
        System.out.println("Кричать нажмите 1");
        System.out.println("Есть    нажмите 2");
        System.out.println("Спать   нажмите 3");
        System.out.println("Особая команда   нажмите 4");

        switch (Integer.parseInt(reader.readLine())) {
            case (1) -> zoo.allVoice();
            case (2) -> zoo.allEat();
            case (3) -> zoo.allSleep();
            case (4) -> zoo.allSpecialMethod();
        }
    }

    public static void trainigAnimal() throws IOException {
        System.out.print("Напишите имя кого хотите тренировать: ");
        zoo.tre(reader.readLine());
    }

    public static void run() throws IOException {
        System.out.println("Добро пожаловать в питомник!");
        while (isWork) {
            int operation = getOperation();
            switch (operation) {
                case (1) -> addAnimal();
                case (2) -> listOfCommands();
                case (3) -> trainigAnimal(); //System.out.println(variable); проверял класс AnimalCount
                case (0) -> isWork = false;
            }
        }
    }
}