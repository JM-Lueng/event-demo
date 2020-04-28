package com.lueng.eventdemo;

import com.google.common.eventbus.AsyncEventBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class EventDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDemoApplication.class, args);
    }

    @Bean
    public AsyncEventBus asyncEventBus() {
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(5);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 1000, 60000, TimeUnit.SECONDS, workQueue);
        return new AsyncEventBus(threadPoolExecutor);
    }
}
