package com.springframwork.guru.service;

import com.springframwork.guru.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;

    public void sendString(String string){
        rabbitTemplate.convertAndSend(exchange,routingkey, string);
    }

    public void sendUser(User user){
        rabbitTemplate.convertAndSend(exchange,routingkey, user);
    }

}
