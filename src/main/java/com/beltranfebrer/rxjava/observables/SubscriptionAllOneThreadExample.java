package com.beltranfebrer.rxjava.observables;

import com.beltranfebrer.rxjava.data.NumbersGenerator;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;

/**
 * Created by Miquel Beltran on 15.04.16.
 * More on http://beltranfebrer.com
 */
public class SubscriptionAllOneThreadExample {
    public static void main(String[] args) throws InterruptedException {

        Object waitMonitor = new Object();
        synchronized (waitMonitor) {

            List<Integer> integerList = NumbersGenerator.getList(20);
            Observable<Integer> observable = Observable.from(integerList);
            observable
                    .flatMap(val -> Observable.just(val)
                            .subscribeOn(Schedulers.computation())
                            .map(i -> NumbersGenerator.fibonacci(i)))
                    .subscribe((integer -> {
                                System.out.println("onNext thread entr: " + Thread.currentThread().getName());
                                System.out.println(integer);
                                System.out.println("onNext thread exit: " + Thread.currentThread().getName());
                            }),
                            (e) -> e.printStackTrace(),
                            (() -> {
                                System.out.println("onCompleted");
                                synchronized (waitMonitor) {
                                    waitMonitor.notify();
                                }
                            }));
            waitMonitor.wait();
        }

    }

}
