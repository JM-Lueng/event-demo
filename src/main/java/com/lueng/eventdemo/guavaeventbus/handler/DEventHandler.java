package com.lueng.eventdemo.guavaeventbus.handler;

import com.lueng.eventdemo.guavaeventbus.DEvent;
import org.springframework.stereotype.Component;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Component
public class DEventHandler implements EventHandler {

    @Override
    public void subscribe(DEvent dEvent) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(dEvent.getMsg());
    }
}
