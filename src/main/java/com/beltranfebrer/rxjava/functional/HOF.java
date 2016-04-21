package com.beltranfebrer.rxjava.functional;

import java.util.function.Function;
import java.util.function.Supplier;

public class HOF {
    public static void main(String[] args) {
        Supplier<String> xformOperation = createCombineAndTransform("Hello ",
                "World", (a) -> a.toUpperCase());
        System.out.println(xformOperation.get());
    }

    public static Supplier<String> createCombineAndTransform(
            final String a, final String b,
            final Function<String, String> transformer) {
        return () -> {
            String aa = a;
            String bb = b;
            if (transformer != null) {
                aa = transformer.apply(a);
                bb = transformer.apply(b);
            }
            return aa + bb;
        };
    }
}
