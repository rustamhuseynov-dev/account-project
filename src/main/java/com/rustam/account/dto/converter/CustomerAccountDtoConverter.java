package com.rustam.account.dto.converter;

import com.rustam.account.dto.CustomerAccountDto;
import com.rustam.account.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerAccountDtoConverter {

    private final TransactionDtoConverter transactionDtoConverter;

    public CustomerAccountDto convert(Account account){
        return CustomerAccountDto.builder()
                .balance(account.getBalance())
                .creationDate(account.getCreationDate())
                .transactions(account.getTransaction().stream()
                        .map(transactionDtoConverter::convert)
                        .collect(Collectors.toSet()))
                .build();
    }

}
