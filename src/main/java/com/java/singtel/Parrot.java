package com.java.singtel;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Parrot extends Bird {

        public Animal getInstance(String instancetype) {
        switch (instancetype) {
            case "Dog":
                return  new Dog();
            case "Cat":
                return  new Cat();
            case "Rooster":
                return  (Animal) new Rooster();
            case "Duck":
                return  (Animal) new Duck();
            default:
                return null;

        }

    }

    public boolean sing(String parrotLivingWith) {
    Animal animal=getInstance( parrotLivingWith );
    return animal.sing();
    }
}
