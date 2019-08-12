package org.ougen.springclouddemoclient.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:36 2019/7/31
 */
public class OwnApplicationRunListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("监听成功");
    }
}
