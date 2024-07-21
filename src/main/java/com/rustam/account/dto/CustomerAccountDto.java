package com.rustam.account.dto;

import com.rustam.account.model.Transaction;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Builder
public class CustomerAccountDto {

    private BigDecimal balance = BigDecimal.ZERO;

    private Set<TransactionDto> transactions;

    private LocalDateTime creationDate;
}