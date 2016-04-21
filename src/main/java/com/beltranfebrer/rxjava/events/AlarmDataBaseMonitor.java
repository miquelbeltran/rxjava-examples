package com.beltranfebrer.rxjava.events;

import javax.xml.crypto.Data;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class AlarmDataBaseMonitor extends AlarmsMonitor {
    private final DataBaseService service;

    public AlarmDataBaseMonitor(AlarmsSystem alarmsSystem, DataBaseService service) {
        super(alarmsSystem);
        this.service = service;
    }

    @Override
    void handleAlarm(AlarmEvent alarmEvent) {
        service.saveAlarm(alarmEvent.severity, alarmEvent.cause);
    }
}
