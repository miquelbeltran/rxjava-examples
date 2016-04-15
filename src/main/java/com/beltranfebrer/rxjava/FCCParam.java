package com.beltranfebrer.rxjava;

import java.util.function.Function;

public class FCCParam {
    public static void main(String[] args) {
        System.out.println(concatAndTransform("Hello ", "World", (s) -> {
            return s.toUpperCase();
        }));

        Function<String, String> transformToLower = (s) -> {
            return s.toLowerCase();
        };
        System.out.println(concatAndTransform("Hello ", "World", transformToLower));
    }

    public static String concatAndTransform(String a, String b,
                                            Function<String, String> stringTransform) {
        if (stringTransform != null) {
            a = stringTransform.apply(a);
            b = stringTransform.apply(b);
        }
        return a + b;
    }
}
