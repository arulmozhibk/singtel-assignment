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
    }
}
