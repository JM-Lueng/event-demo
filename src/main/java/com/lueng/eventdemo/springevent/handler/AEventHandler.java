package com.lueng.eventdemo.springevent.handler;

import com.lueng.eventdemo.springevent.AEvent;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
public class AEventHandler implements EventHandler {

    @Override
    public void listen(AEvent aEvent) {
        System.out.println("A业务事件处理");
    }
}
