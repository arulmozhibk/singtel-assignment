package com.java.singtel;

 public interface Animal {

    public default boolean walk() {
        System.out.println( "I am walking" );
        return true;
    }
     public default boolean sing(){
        System.out.println( "Animal is  singing" );
        return true;
    }

    boolean swim() ;

}
