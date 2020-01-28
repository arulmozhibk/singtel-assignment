package com.java.singtel;

public class Chicken extends Bird{

    @Override
    public boolean sing() {
        System.out.println( "Cluck, cluck" );
        return true;
    }

    @Override
    public boolean fly() {
        System.out.println( "Chicken can't fly" );
        return false;
    }



}
