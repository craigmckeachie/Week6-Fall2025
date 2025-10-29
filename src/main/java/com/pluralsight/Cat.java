package com.pluralsight;

public class Cat extends Animal{

    public void makeSound(){
        System.out.println("Meow, Meow, purrr");
    }

    public String coughHairball(){
        System.out.println("Houuuk Houuuk Houkkk tuah");
        return "Hairball";
    }
}
