package com.beltranfebrer.rxjava.events;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public abstract class AlarmsMonitor {

    public AlarmsMonitor(AlarmsSystem alarmsSystem) {
        alarmsSystem.subscribe(this::handleAlarm);
    }

    abstract void handleAlarm(AlarmEvent alarmEvent);
}
