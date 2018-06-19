package com.luomo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@Slf4j
public class ApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        log.info("......ApplicationPreparedEvent......");
    }
}
