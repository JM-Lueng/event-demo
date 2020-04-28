package com.lueng.eventdemo.springevent.handler;

import com.lueng.eventdemo.springevent.AEvent;
import com.lueng.eventdemo.springevent.BEvent;
import com.lueng.eventdemo.springevent.CEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
public interface EventHandler {

    @EventListener
    @Async
    default void listen(AEvent aEvent) {

    }

    @EventListener
    default void listen(BEvent bEvent) {

    }

    @EventListener
    default void listen(CEvent cEvent) {

    }
}
