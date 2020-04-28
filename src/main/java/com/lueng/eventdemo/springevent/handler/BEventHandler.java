package com.lueng.eventdemo.springevent.handler;

import com.lueng.eventdemo.springevent.BEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
@EnableAsync
public class BEventHandler implements EventHandler {

    @Override
    @Async
    public void listen(BEvent bEvent) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B业务事件处理");
    }
}
