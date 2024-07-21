package com.rustam.account.dto;

import com.rustam.account.model.Transaction;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Builder
public class AccountDto {

    private BigDecimal balance;

    private LocalDateTime creationDate;

    private CustomerDto customerDto;

    private Set<TransactionDto> transactionDto;
}
