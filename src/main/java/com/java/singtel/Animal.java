package com.java.singtel;

 interface Animal {

    public default void walk() {
        System.out.println( "I am walking" );
    }
     public default boolean sing(){
        System.out.println( "Animal is not singing" );
        return false;
    }

}
