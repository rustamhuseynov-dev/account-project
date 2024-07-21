package com.rustam.account.dto.converter;

import com.rustam.account.dto.CustomerDto;
import com.rustam.account.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerDtoConverter {

    private final CustomerAccountDtoConverter customerAccountDtoConverter;

    public CustomerDto convertToCustomerDto(Customer from){
        return CustomerDto.builder()
                .name(from.getName())
                .surname(from.getSurname())
                .accounts(from.getAccounts().stream()
                        .map(customerAccountDtoConverter::convert)
                        .collect(Collectors.toSet()))
                .build();
    }


}
