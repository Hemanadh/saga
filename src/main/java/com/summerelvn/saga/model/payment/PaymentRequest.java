package com.summerelvn.saga.model.payment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentRequest {
    String id; //just included to let saga orchestrator pass the id value
    String name;
    String type;
    BigDecimal price;
}
