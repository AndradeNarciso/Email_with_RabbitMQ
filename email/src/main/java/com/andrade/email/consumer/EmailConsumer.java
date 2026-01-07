package com.andrade.email.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {
     
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void listenEmailFromQueueRabbit(@Payload String email){
        System.out.println(email);
    }
}
