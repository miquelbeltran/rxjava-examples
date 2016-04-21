package com.beltranfebrer.rxjava.events;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class AlarmEvent {
    public final String cause;
    public final String severity;

    public AlarmEvent(String cause, String severity) {
        this.cause = cause;
        this.severity = severity;
    }
}
