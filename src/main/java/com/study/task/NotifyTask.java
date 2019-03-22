package com.study.task;

import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@PropertySource("classpath:application.properties")
public class NotifyTask {

    @Scheduled(cron = "1/2 * *  * * * ")
    public void notifyToMyFriends() {
        System.out.println("task1 start....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task1 end....");
    }

    @Scheduled(cron = "1/2 * *  * * * ")
    public void notifyToMyFriends2() {
        System.out.println("task2 start....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task2 end....");
    }
}