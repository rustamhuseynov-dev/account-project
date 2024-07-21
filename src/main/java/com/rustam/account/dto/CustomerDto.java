package com.rustam.account.dto;

import lombok.Builder;

import java.util.Set;

@Builder
public class CustomerDto {

    private String name;

    private String surname;

    private Set<CustomerAccountDto> accounts;

}
