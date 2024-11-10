package com.commerce.sales.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int quantity;
    private LocalDate saleDate;

    // Getters and Setters
}
