package com.andrade.email.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {

    @Value("${rabbitmq.queue}")
    private String nameQueue;

    @Bean
    public Queue queue() {
        return new Queue(nameQueue, true);
    }

}
