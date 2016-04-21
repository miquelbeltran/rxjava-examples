package com.beltranfebrer.rxjava.transformers;

import com.beltranfebrer.rxjava.data.DataGenerator;
import rx.Observable;

/**
 * Created by Miquel Beltran on 16.04.16.
 * More on http://beltranfebrer.com
 */
public class Maps {
    public static void main(String[] args) {
        System.out.println("Simple map usage");
        Observable.from(DataGenerator.names())
               .map((name) -> name.toUpperCase())
               .subscribe((name) -> System.out.println(name));
        System.out.println("FlatMap with two outputs usage");
        Observable.from(DataGenerator.names())
                .flatMap((name) -> {
                    String[] out = {
                            name.toUpperCase(),
                            name.toLowerCase()
                    };
                    return Observable.from(out);
                })
                .subscribe((name) -> System.out.println(name));
    }
}
