package com.lueng.eventdemo.guavaeventbus;

import lombok.Data;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@Data
public class FEvent implements Event {

    private String msg;

    public FEvent(String msg) {
        this.msg = msg;
    }
}
