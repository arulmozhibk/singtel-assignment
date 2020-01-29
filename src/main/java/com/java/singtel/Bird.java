package com.java.singtel;

public class Bird implements Animal {

    public boolean fly(){
        System.out.println( "Bird is singing" );
        return true;
    }
    public boolean sing(){
        System.out.println( "Bird is singing" );
        return true;
    }

    @Override
    public boolean walk() {
        System.out.println("I am walking");
        return true;

    }

    @Override
    public boolean swim() {
        System.out.println("I can swim");
        return false;
    }




}
