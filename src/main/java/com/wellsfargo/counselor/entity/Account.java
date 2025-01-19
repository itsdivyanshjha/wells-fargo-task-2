package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private float balance;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date openDate;

    // Constructors, getters, and setters
} 