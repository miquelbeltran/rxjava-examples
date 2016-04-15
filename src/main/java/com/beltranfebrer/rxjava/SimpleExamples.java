package com.beltranfebrer.rxjava;

import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;
import java.util.concurrent.FutureTask;

/**
 * Created by Miquel Beltran on 15.04.16.
 * More on http://beltranfebrer.com
 */
public class SimpleExamples {
    public static void main(String[] args) {
        Observable<Integer> observable = null;
        observable = Observable.just(Integer.valueOf(42));
        observable.subscribe((i) -> {
            System.out.println(i);
        });

        // Example with Future
        Observable<List<Integer>> observableFutureList;
        FutureTask<List<Integer>> future = new FutureTask<List<Integer>>(() -> NumbersGenerator.getList(10));
        observableFutureList = Observable.from(future);
        Schedulers.computation().createWorker().schedule(() -> future.run());
        observableFutureList.subscribe((list) -> {
            list.forEach((integer -> System.out.println(integer)));
        });
    }
}
