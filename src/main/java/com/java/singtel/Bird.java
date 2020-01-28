package com.java.singtel;

public class Bird implements Animal {

    void fly() {
        System.out.println( "I am flying" );
    }

    public boolean sing(){
        System.out.println( "Bird is singing" );
        return true;
    }


}
