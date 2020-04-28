package com.lueng.eventdemo.springevent.handler;

import com.lueng.eventdemo.springevent.CEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
@EnableAsync
public class CEventHandler implements EventHandler {

    @Override
    @Async
    public void listen(CEvent cEvent) {
        System.out.println("C业务事件处理");
    }
}
