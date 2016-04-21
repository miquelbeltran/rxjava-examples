package com.beltranfebrer.rxjava.events;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class EventsExample {
    /**
     * Alarms can be registered into the AlarmsSystem.
     * AlarmsSystem has a PublishSubject that can be observed.
     * The EmailService is, as the same says, a service to send emails.
     * the DataBaseService is, as the name says, a data base.
     * EmailService is slow, the email server takes a second to send emails.
     * DataBaseService is fast, inserts a row in the db quickly.
     * @param args
     */
    public static void main(String[] args) {
        AlarmsSystem alarmsSystem = new AlarmsSystem();
        EmailService emailService = new EmailService();
        DataBaseService dataBaseService = new DataBaseService();
        new AlarmEmailMonitor(alarmsSystem, emailService);
        new AlarmDataBaseMonitor(alarmsSystem, dataBaseService);
        alarmsSystem.registerAlarm("Intrusion detected", "CRITICAL");
        alarmsSystem.registerAlarm("Water level low", "WARNING");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
