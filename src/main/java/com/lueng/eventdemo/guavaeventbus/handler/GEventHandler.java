package com.lueng.eventdemo.guavaeventbus.handler;

import com.lueng.eventdemo.guavaeventbus.GEvent;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
public class GEventHandler implements EventHandler {

    @Override
    public void subscribe(GEvent gEvent) {
        System.out.println(gEvent.getMsg());
    }
}
