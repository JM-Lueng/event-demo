package com.lueng.eventdemo;

import com.lueng.eventdemo.guavaeventbus.DEvent;
import com.lueng.eventdemo.guavaeventbus.FEvent;
import com.lueng.eventdemo.guavaeventbus.GEvent;
import com.lueng.eventdemo.guavaeventbus.publisher.EventPublisher;
import com.lueng.eventdemo.springevent.AEvent;
import com.lueng.eventdemo.springevent.BEvent;
import com.lueng.eventdemo.springevent.CEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author J.M.Lueng
 * @since 2020/4/28
 */
@RestController
@RequestMapping("/v1/event")
public class DemoController {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private EventPublisher eventPublisher;

    @GetMapping("/spring-event")
    public String springEvent() {
        System.out.println("正在发布事件....");
        applicationEventPublisher.publishEvent(new BEvent("msg", "msg"));
        applicationEventPublisher.publishEvent(new CEvent("msg", "msg"));
        applicationEventPublisher.publishEvent(new AEvent("msg", "msg"));
        System.out.println("事件已发布！");
        return "spring event";
    }

    @GetMapping("/eventbus")
    public String eventBus() {
        System.out.println("正在发布事件....");
        eventPublisher.publish(new DEvent("D事件消息"));
        eventPublisher.publish(new FEvent("F事件消息"));
        eventPublisher.publish(new GEvent("G事件消息"));
        System.out.println("事件已发布！");
        return "eventbus";
    }
}
