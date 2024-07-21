package com.rustam.account.dto;

import com.rustam.account.model.TransactionType;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public class TransactionDto {

    private TransactionType transactionType = TransactionType.INITIAL;

    private BigDecimal amount;

    private LocalDateTime transactionDate;

}
