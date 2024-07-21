package com.rustam.account.dto.converter;

import com.rustam.account.dto.AccountDto;
import com.rustam.account.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AccountDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    private final TransactionDtoConverter transactionDtoConverter;

    public AccountDto convert(Account from){

        return AccountDto.builder()
                .balance(from.getBalance())
                .creationDate(from.getCreationDate())
                .customerDto(customerDtoConverter.convertToCustomerDto(from.getCustomer()))
                .transactionDto(Objects.requireNonNull(from.getTransaction())
                        .stream()
                        .map(transactionDtoConverter::convert)
                        .collect(Collectors.toSet()))
                .build();
    }
}
