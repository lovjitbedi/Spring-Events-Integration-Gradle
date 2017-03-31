package com.bootcamp.events;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nidhi on 31/3/17.
 */
public class MainEvent {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    context.start();
    context.stop();
  }
}
