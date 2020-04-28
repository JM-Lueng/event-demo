package com.lueng.eventdemo.guavaeventbus.handler;

import com.lueng.eventdemo.guavaeventbus.FEvent;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
public class FEventHandler implements EventHandler {

    @Override
    public void subscribe(FEvent fEvent) {
        System.out.println(fEvent.getMsg());
    }
}
