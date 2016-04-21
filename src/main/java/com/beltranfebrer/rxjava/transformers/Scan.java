package com.beltranfebrer.rxjava.transformers;

import com.beltranfebrer.rxjava.data.DataGenerator;
import rx.Observable;

/**
 * Created by Miquel Beltran on 16.04.16.
 * More on http://beltranfebrer.com
 */
public class Scan {
    public static void main(String[] args) {
        System.out.println("Simple scan usage");
        Observable.from(DataGenerator.names())
                .scan(new StringBuilder(), (buffer, next) -> buffer.append(next))
                .subscribe((name) -> System.out.println(name));
        System.out.println("Only the last");
        Observable.from(DataGenerator.names())
                .scan(new StringBuilder(), (buffer, next) -> buffer.append(next))
                .last()
                .subscribe((name) -> System.out.println(name));
    }
}
