package com.cloudwithj.api.model;

import java.math.BigDecimal;

public record PaymentPayload(String orderId, BigDecimal amount) {
}