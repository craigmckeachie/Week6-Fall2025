package com.pluralsight;

import java.util.ArrayList;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal dog = new Dog();
        Animal cat = new Cat();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal: animals) {
            System.out.println(animal.getClass());
            animal.makeSound();
        }





//        Animal dog = new Dog();
//        dog.eat();
//        dog.sleep();
//        dog.breathe();
//        dog.sniffButt();
//        dog.makeSound();

//        Animal cat = new Cat();
//        cat.eat();
//        cat.sleep();
//        cat.breathe();
//        String output = cat.coughHairball();
//        System.out.println(output);
//        cat.makeSound();





    }
}
