package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String licenseNumber;

    @Column(nullable = false)
    private int yearsOfExperience;

    // Constructors, getters, and setters
} 