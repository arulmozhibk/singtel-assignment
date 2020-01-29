package com.java.singtel;

public class Cat implements Animal{


    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean sing() {
        System.out.println( "Meow" );
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
