package com.java.singtel;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Bird {

    Chicken chicken = new Chicken();

    public boolean fly() {
        boolean roosterfly;
        roosterfly = chicken.fly();
        return roosterfly;
    }

    public boolean sing() {
        System.out.println( "Cock-a-doodle-doo" );
        return true;
    }

    private static final Map<String, String> roosterLanguage;

    static {
        roosterLanguage = new HashMap<String, String>();
        roosterLanguage.put( "English", "Cock-a-doodle-doo" );
        roosterLanguage.put( "Danish", "kykyliky" );
        roosterLanguage.put( "Dutch", "kukeleku" );
        roosterLanguage.put( "Finnish", "kukko kiekuu" );
        roosterLanguage.put( "French", "cocorico" );
        roosterLanguage.put( "German", "kikeriki" );
        roosterLanguage.put( "Greek", "kikiriki" );
        roosterLanguage.put( "Hebrew", "coo-koo-ri-koo" );
        roosterLanguage.put( "Hungarian", "kukuriku" );
        roosterLanguage.put( "Italian", "chicchirichi" );
        roosterLanguage.put( "Japanese", "ko-ke-kok-ko-o" );
        roosterLanguage.put( "Portuguese", "cucurucu" );
        roosterLanguage.put( "Russian", "kukareku" );
        roosterLanguage.put( "Swedish", "kuckeliku" );
        roosterLanguage.put( "Turkish", "kuk-kurri-kuuu" );
        roosterLanguage.put( "Urdu", "kuklooku" );
    }

    public boolean sing(String language) {

        System.out.println( " Rooster sing Cock-a-doodle-doo" );
        if (null == language || language.isEmpty()) {
            System.out.println( "Cock-a-doodle-doo" );
        } else {
            System.out.println( roosterLanguage.get( language ) );
        }
        return true;
    }
}