package com.rustam.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TransactionType transactionType = TransactionType.INITIAL;

    private BigDecimal amount;

    private LocalDateTime transactionDate;

    @ManyToOne(fetch = FetchType.LAZY,
            optional = false,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;

}
