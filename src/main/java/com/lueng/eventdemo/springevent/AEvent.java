package com.lueng.eventdemo.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
public class AEvent extends ApplicationEvent {

    private String msg;

    public AEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
