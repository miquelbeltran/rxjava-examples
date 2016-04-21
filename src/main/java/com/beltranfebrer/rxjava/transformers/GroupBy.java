package com.beltranfebrer.rxjava.transformers;

import com.beltranfebrer.rxjava.data.NumbersGenerator;
import rx.Observable;
import rx.observables.GroupedObservable;

/**
 * Created by Miquel Beltran on 16.04.16.
 * More on http://beltranfebrer.com
 */
public class GroupBy {
    public static void main(String[] args) {
        System.out.println("Simple scan usage");
        Observable.from(NumbersGenerator.getList(1000))
                .groupBy((i) -> 0 == (int)i % 2 ? "EVEN" : "ODD")
                .subscribe((group) -> {
                    System.out.println("Key " + ((GroupedObservable)group).getKey());
                    ((GroupedObservable)group).subscribe((x) -> System.out.println(((GroupedObservable)group).getKey() + ": " + x));
                });
    }
}
