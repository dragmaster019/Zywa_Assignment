package com.assignment.Zywa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transaction")

public class Transaction {

    private String email;
    private String amount;

    @CreationTimestamp
    private LocalDate date1;

    @UpdateTimestamp

    private LocalDate date2;




}
