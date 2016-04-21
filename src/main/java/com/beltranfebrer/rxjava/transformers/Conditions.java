package com.beltranfebrer.rxjava.transformers;

import com.beltranfebrer.rxjava.data.DataGenerator;
import rx.Observable;

/**
 * Created by Miquel Beltran on 16.04.16.
 * More on http://beltranfebrer.com
 */
public class Conditions {
    public static void main(String[] args) {
        Observable.empty()
                .defaultIfEmpty("Hello World")
                .subscribe((name) -> System.out.println(name));
        System.out.println("");
        Observable.from(DataGenerator.names())
                .defaultIfEmpty("Hello World")
                .first()
                .subscribe((name) -> System.out.println(name));
        System.out.println("");
        Observable.from(DataGenerator.names())
                .filter((name) -> !name.contains(" "))
                .subscribe((name) -> System.out.println(name));
        System.out.println("");
        Observable.from(DataGenerator.names())
                .take(3)
                .subscribe((name) -> System.out.println(name));
    }
}
