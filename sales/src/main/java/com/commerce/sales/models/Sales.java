package com.commerce.sales.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false) // Foreign key column in the Sales table
    private Product product;

    @Column(nullable = false) // Ensures quantity cannot be null
    private int quantity;

    @Column(nullable = false) // Ensures saleDate cannot be null
    private LocalDate saleDate;

    // Default constructor (required by JPA)
    public Sales() {
    }

    // Constructor with all fields except ID (ID is auto-generated)
    public Sales(Product product, int quantity, LocalDate saleDate) {
        this.product = product;
        this.quantity = quantity;
        this.saleDate = saleDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    // toString method for debugging or logging
    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", product=" + (product != null ? product.getName() : "null") +
                ", quantity=" + quantity +
                ", saleDate=" + saleDate +
                '}';
    }
}
