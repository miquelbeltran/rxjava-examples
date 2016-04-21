package com.beltranfebrer.rxjava.events;

/**
 * Created by Miquel Beltran on 21.04.16.
 * More on http://beltranfebrer.com
 */
public class EmailService {
    public void sendEmail(String receiver, String subject, String content) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------");
        System.out.println(" Thread: " + Thread.currentThread().getName());
        System.out.println(" Email to: " + receiver);
        System.out.println(" Subject: " + subject);
        System.out.println(" Content: ");
        System.out.println(content);
        System.out.println("----------------------------------");
    }
}
