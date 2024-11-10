package com.commerce.sales.services;

import com.commerce.sales.models.Sales;
import com.commerce.sales.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sales> getSalesByDateRange(LocalDate startDate, LocalDate endDate) {
        return saleRepository.findBySaleDateBetween(startDate, endDate);
    }

    public Sales addSale(Sales sale) {
        return saleRepository.save(sale);
    }
}
