package com.luomo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@Component
public class ScheduledTasks {

    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    //每5秒执行一次
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("现在时间：" + DATE_FORMAT.format(new Date()));
    }

}
