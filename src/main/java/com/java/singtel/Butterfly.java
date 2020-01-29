package com.java.singtel;

public class Butterfly implements Animal {
    private boolean isCaterpiller = false;

    public boolean isCaterpiller() {
        return isCaterpiller;
    }

    public void setCaterpiller(boolean isCaterpiller) {
        this.isCaterpiller = isCaterpiller;
    }

    @Override
    public boolean sing() {
        System.out.println( "Butterfly cannot sing" );
        return false;

    }

    @Override
    public boolean walk() {
        if (isCaterpiller()) {
            System.out.println( "Butterfly can walk/crawl" );
            return true;
        } else {
            System.out.println( "Butterfly cannot walk" );
            return false;
        }

    }

    @Override
    public boolean fly() {

        if (isCaterpiller()) {
            System.out.println( "Butterfly cannot fly " );
            return false;
        } else {
            System.out.println( "Butterfly am flying" );
            return true;
        }

    }

    @Override
    public boolean swim() {
        System.out.println( "Butterfly cannot swim" );
        return false;
    }

}
