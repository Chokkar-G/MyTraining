package com.gradle.example;

/**
 * Created by Chokkar on 4/23/2016.
 */
public class IConstants {

    // Here I am gonna use Enum - So need to check hardcode string in class file


    public enum Type {
        FREE , PAID;
    }

    public static Type freeType = Type.FREE;

}
