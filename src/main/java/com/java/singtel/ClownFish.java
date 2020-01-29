package com.java.singtel;

public class ClownFish implements Fish {


    @Override
    public boolean fly() {

        System.out.println( "ClownFish cannot fly" );
        return false;


    }

    @Override
    public boolean sing() {
        System.out.println( "ClownFish cannot sing" );
        return false;

    }

    @Override
    public boolean walk() {
        System.out.println( "ClownFish cannot walk" );
        return false;

    }

    @Override
    public boolean swim() {
        System.out.println( "ClownFish can swim" );
        return true;

    }

    @Override
    public void size() {
        System.out.println( "ClownFish am small" );

    }

    @Override
    public void colour() {
        System.out.println( "ClownFish am Orange in colour" );
    }

    @Override
    public boolean eat() {
        System.out.println( "ClownFish dont eat other fish" );
        return false;

    }

    @Override
    public boolean makeJokes() {
        System.out.println( "ClownFish make Jokes" );
        return true;

    }


}
