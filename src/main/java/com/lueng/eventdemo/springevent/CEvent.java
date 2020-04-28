package com.lueng.eventdemo.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
public class CEvent extends ApplicationEvent {

    private String msg;

    public CEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
