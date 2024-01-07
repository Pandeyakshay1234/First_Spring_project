package com.Service.Services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AirtelProvider airtelProvider = context.getBean("Airtel" , AirtelProvider.class);
        airtelProvider.GiveService();

    }

}
