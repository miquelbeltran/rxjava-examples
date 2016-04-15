package com.beltranfebrer.rxjava;

import java.util.function.BiFunction;

public class FirstClassCitizen {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatFunction = (s, t) -> {
            return s + t;
        };
        System.out.println(concatFunction.apply("Hello ", "World 1"));

        concatFunction = FirstClassCitizen::concatStrings;
        System.out.println(concatFunction.apply("Hello ", "World 2"));

        FirstClassCitizen instance = new FirstClassCitizen();
        concatFunction = instance::concatStrings2;
        System.out.println(concatFunction.apply("Hello ", "World 3"));
    }

    private static String concatStrings(String a, String b) {
        return a + b;
    }

    String concatStrings2(String a, String b) {
        return a + b;
    }
}
