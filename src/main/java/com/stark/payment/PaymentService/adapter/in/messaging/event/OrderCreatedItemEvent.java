package com.stark.payment.PaymentService.adapter.in.messaging.event;

import java.math.BigDecimal;

public record OrderCreatedItemEvent(
        String productId,
        int quantity,
        BigDecimal unitPrice
)  {
}
