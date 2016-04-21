package com.beltranfebrer.rxjava.data;

import java.util.ArrayList;

/**
 * Created by Miquel Beltran on 16.04.16.
 * More on http://beltranfebrer.com
 */
public class DataGenerator {

    public static Iterable<String> names() {
        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("Italian Riviera");
        myArr.add("Jersey Shore");
        myArr.add("Puerto Rico");
        myArr.add("Los Cabos Corridor");
        myArr.add("Lubmin");
        myArr.add("Coney Island");
        myArr.add("Karlovy Vary");
        myArr.add("Bourbon-l'Archambault");
        myArr.add("Walt Disney World Resort");
        myArr.add("Barbados");
        return myArr;
    }
}
