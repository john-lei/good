package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by john on 2017/12/9.
 */
@Component
public class CronTasks {

    private  SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedDelay = 2000)
    public void cronDemoTasks(){
        System.out.println("CronTask: Hello, this is for test :" + dateFormat.format(new Date()));
    }
}
