package com.cloudwithj.api;

import com.cloudwithj.api.model.PaymentPayload;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Process a payment", description = "Process a payment for the order")
    public ResponseEntity<Void> processPayment(@RequestBody PaymentPayload paymentPayload) {
        log.info("Processing payment for order: {}", paymentPayload);
        return ResponseEntity.ok().build();
    }
}