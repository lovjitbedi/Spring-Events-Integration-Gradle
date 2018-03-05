package com.bootcamp.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by nidhi on 31/3/17.
 */
public class ContextRefreshEvent implements ApplicationListener<ContextRefreshedEvent> {
  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("Application context refreshed....");
  }
}
