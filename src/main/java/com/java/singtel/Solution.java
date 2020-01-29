package com.java.singtel;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println("=====================BIRD===================");
        bird.walk();
        bird.fly();
        bird.sing();


        System.out.println("=====================DUCK=====================");
        Bird duck =  new Duck();
        duck.sing();
        duck.swim();
        System.out.println("=====================CHICKEN=====================");
        Bird chicken =  new Chicken();
        chicken.sing();
        chicken.fly();

        System.out.println("=====================ROOSTER=====================");
        Rooster rooster =  new Rooster();// No inheritance relationship b/w Chicken and Rooster
        rooster.sing();
        rooster.fly();

        System.out.println("=====================PARROT=====================");
        Parrot parrot=new Parrot();
        parrot.sing( "Dog" );
        parrot.sing( "Cat" );
        parrot.sing( "Rooster" );
        parrot.sing( "Duck" );

        System.out.println("=====================SHARK=====================");
        Shark shark = new Shark();
        shark.fly();
        shark.sing();
        shark.walk();
        shark.swim();
        shark.colour();
        shark.eat();
        shark.makeJokes();

        System.out.println("=====================CLOWN FISH=====================");
        ClownFish clownFish = new ClownFish();
        clownFish.fly();
        clownFish.sing();
        clownFish.walk();
        clownFish.swim();
        clownFish.colour();
        clownFish.eat();
        clownFish.makeJokes();
        System.out.println("=====================DOLPHIN=====================");
        Dolphin dolphin = new Dolphin();
        dolphin.hasFish(new Shark());
        dolphin.fly();
        dolphin.sing();
        dolphin.swim();
        dolphin.walk();

    }
}
