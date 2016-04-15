package com.beltranfebrer.rxjava;

import java.util.function.BiFunction;

public class FirstClassCitizen {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatFunction = (s, t) -> {
            return s + t;
        };
        System.out.println(concatFunction.apply("Hello ", "World 1"));
    }
}
