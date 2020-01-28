package com.java.singtel;

public class Duck extends Bird {

    @Override
    public boolean sing() {
        System.out.println( "Quack, quack" );
        return true;
    }
    @Override
    public boolean swim() {
        System.out.println("Duck can swim");
        return true;
    }

}
