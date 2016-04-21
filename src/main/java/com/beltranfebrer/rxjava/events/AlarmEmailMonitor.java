package com.beltranfebrer.rxjava.events;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class AlarmEmailMonitor extends AlarmsMonitor {
    private final EmailService emailService;

    public AlarmEmailMonitor(AlarmsSystem alarmsSystem, EmailService emailService) {
        super(alarmsSystem);
        this.emailService = emailService;
    }

    /**
     * This gets called when a new alarm happens.
     */
    void handleAlarm(AlarmEvent alarmEvent) {
        String receiver = "miquel@example.com";
        StringBuilder builder = new StringBuilder();
        builder.append("Alarm [");
        builder.append(alarmEvent.severity);
        builder.append("] ");
        builder.append(alarmEvent.cause);
        String subject = builder.toString();
        builder = new StringBuilder();
        builder.append("Received alarm with severity ");
        builder.append(alarmEvent.severity);
        builder.append(".\n");
        builder.append("Cause: ");
        builder.append(alarmEvent.cause);
        builder.append(".\n");
        String content = builder.toString();
        emailService.sendEmail(receiver, subject, content);
    }
}
