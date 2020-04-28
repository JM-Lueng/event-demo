package com.lueng.eventdemo.guavaeventbus;

import lombok.Data;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Data
public class DEvent implements Event {

    private String msg;

    public DEvent(String msg) {
        this.msg = msg;
    }
}
