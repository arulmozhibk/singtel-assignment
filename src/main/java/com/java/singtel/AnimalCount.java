package com.java.singtel;

public class AnimalCount {

    public static void main(String[] args) {
        System.out.println( "================Animal Count================" );
        int countFly = 0;
        int countWalk = 0;
        int countSing = 0;
        int countSwim = 0;
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Shark(),
                new ClownFish(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        for (Animal animal : animals) {
            System.out.println( animal.getClass().getName() + "==========Count Start================----" );
            if (animal.fly())
                countFly++;
            if (animal.walk())
                countWalk++;
            if (animal.sing())
                countSing++;
            if (animal.swim())
                countSwim++;
            System.out.println( "================Count End================-----" );
        }
        System.out.println( "Number of Animals that can fly: " + countFly );
        System.out.println( "Number of Animals that can walk: " + countWalk );
        System.out.println( "Number of Animals that can sing: " + countSing );
        System.out.println( "Number of Animals that can swim: " + countSwim );
    }
}

