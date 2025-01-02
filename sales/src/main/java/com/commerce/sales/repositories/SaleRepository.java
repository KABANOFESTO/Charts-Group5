package com.commerce.sales.repositories;

import com.commerce.sales.models.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sales, Long> {
    List<Sales> findBySaleDateBetween(LocalDate startDate, LocalDate endDate);
}
