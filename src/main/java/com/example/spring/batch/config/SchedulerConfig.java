package com.example.spring.batch.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@Slf4j
public class SchedulerConfig {
    @Scheduled(fixedRate = 5000)
    public void runScheduler(){
        log.info("Scheduler started.");
    }
}
