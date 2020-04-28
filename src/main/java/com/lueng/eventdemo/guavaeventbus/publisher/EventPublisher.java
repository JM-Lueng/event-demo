package com.lueng.eventdemo.guavaeventbus.publisher;

import com.google.common.eventbus.AsyncEventBus;
import com.lueng.eventdemo.guavaeventbus.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
public class EventPublisher {

    @Autowired
    private AsyncEventBus asyncEventBus;

    public void publish(Event event) {
        asyncEventBus.post(event);
    }
}
