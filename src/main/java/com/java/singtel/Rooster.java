package com.java.singtel;

public class Rooster extends Bird{

Chicken chicken=new Chicken();

    public boolean fly() {
        boolean roosterfly;
        roosterfly=chicken.fly();
        return roosterfly;
    }

    public boolean sing() {
        System.out.println( "Cock-a-doodle-doo" );
        return true;
    }

}
