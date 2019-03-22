package com.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;


@Configuration
public class ScheduledConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //default pool size =1
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(5));
        taskRegistrar.setScheduler(new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                new ThreadFactory() {
                    AtomicInteger counter = new AtomicInteger();
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r,"my-schedule-"+counter.incrementAndGet());
                    }
                }));

    }

}