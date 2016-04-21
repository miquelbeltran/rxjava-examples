package com.beltranfebrer.rxjava.events;

import rx.Observer;
import rx.Scheduler;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class AlarmsSystem {
    private PublishSubject<AlarmEvent> publishSubject;

    public AlarmsSystem() {
        publishSubject = PublishSubject.create();
    }

    public void registerAlarm(String what, String severity) {
        System.out.println("Register Alarm Thread: " + Thread.currentThread().getName());
        System.out.println("Alarm: " + what + " - " + severity);
        publishSubject.onNext(new AlarmEvent(what, severity));
    }

    public void subscribe(Observer<AlarmEvent> observable) {
        publishSubject.observeOn(Schedulers.newThread()).subscribe(observable);
    }

    /**
     * Observation will happen on a new thread
     */
    public void subscribe(Action1<AlarmEvent> action) {
        publishSubject.observeOn(Schedulers.newThread()).subscribe(action);
    }
}
