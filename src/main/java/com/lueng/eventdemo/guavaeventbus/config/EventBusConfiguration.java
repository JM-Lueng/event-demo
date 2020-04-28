package com.lueng.eventdemo.guavaeventbus.config;

import com.google.common.eventbus.AsyncEventBus;
import com.lueng.eventdemo.guavaeventbus.handler.DEventHandler;
import com.lueng.eventdemo.guavaeventbus.handler.FEventHandler;
import com.lueng.eventdemo.guavaeventbus.handler.GEventHandler;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
public class EventBusConfiguration implements InitializingBean {

    @Autowired
    private DEventHandler dEventHandler;
    @Autowired
    private FEventHandler fEventHandler;
    @Autowired
    private GEventHandler gEventHandler;
    @Autowired
    private AsyncEventBus asyncEventBus;

    @Override
    public void afterPropertiesSet() throws Exception {
        asyncEventBus.register(dEventHandler);
        asyncEventBus.register(fEventHandler);
        asyncEventBus.register(gEventHandler);
    }
}
