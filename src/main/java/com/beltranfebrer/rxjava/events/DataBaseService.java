package com.beltranfebrer.rxjava.events;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class DataBaseService {
    public void saveAlarm(String severity, String cause) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DB Thread: " + Thread.currentThread().getName());
        System.out.println("DB SAVE: " + severity + ", " + cause);
    }
}
