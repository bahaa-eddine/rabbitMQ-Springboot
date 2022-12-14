package com.springframwork.guru;

import com.springframwork.guru.service.RabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private RabbitMqSender rabbitMqSender;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Producer service is running ... !");
        rabbitMqSender.sendString("Producer service is running ... !");
    }
}
