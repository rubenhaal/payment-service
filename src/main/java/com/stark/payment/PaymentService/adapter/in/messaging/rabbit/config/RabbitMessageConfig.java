package com.stark.payment.PaymentService.adapter.in.messaging.rabbit.config;


import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.json.JsonMapper;

@Configuration
public class RabbitMessageConfig {

    @Bean
    public JacksonJsonMessageConverter  jackson2JsonMessageConverter(JsonMapper jsonMapper) {
        return new JacksonJsonMessageConverter(jsonMapper);
    }
}
