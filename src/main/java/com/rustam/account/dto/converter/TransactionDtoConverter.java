package com.rustam.account.dto.converter;

import com.rustam.account.dto.TransactionDto;
import com.rustam.account.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from){
        return TransactionDto.builder()
                .transactionType(from.getTransactionType())
                .transactionDate(from.getTransactionDate())
                .amount(from.getAmount())
                .build();
    }
}
