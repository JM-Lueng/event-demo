package com.lueng.eventdemo.guavaeventbus.handler;

import com.google.common.eventbus.Subscribe;
import com.lueng.eventdemo.guavaeventbus.DEvent;
import com.lueng.eventdemo.guavaeventbus.FEvent;
import com.lueng.eventdemo.guavaeventbus.GEvent;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
public interface EventHandler {

    @Subscribe
    default void subscribe(DEvent dEvent) {

    }

    @Subscribe
    default void subscribe(FEvent fEvent) {

   }

    @Subscribe
    default void subscribe(GEvent gEvent) {

    }
}
