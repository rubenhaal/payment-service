package com.stark.payment.PaymentService.adapter.in.messaging.rabbit;

import com.stark.payment.PaymentService.adapter.in.messaging.event.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RabbitOrderCreatedListener {
    private static final Logger log = LoggerFactory.getLogger(RabbitOrderCreatedListener.class);

    @RabbitListener(queues = "order.created.queue")
    public void handle (OrderCreatedEvent orderEvent) {
        log.info("Received OrderCreatedEvent for orderId={}", orderEvent.orderId());

    }
}
