package com.pluralsight;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();


        Dog dog = new Dog();
//        dog.eat();
//        dog.sleep();
//        dog.breathe();
//        dog.sniffButt();
        dog.makeSound();

        Cat cat = new Cat();
//        cat.eat();
//        cat.sleep();
//        cat.breathe();
//        String output = cat.coughHairball();
//        System.out.println(output);
        cat.makeSound();


    }
}
