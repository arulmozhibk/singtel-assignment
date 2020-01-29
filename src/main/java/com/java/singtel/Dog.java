package com.java.singtel;

public class Dog implements Animal {
    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean sing() {
        System.out.println("Woof, woof");
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }
}
