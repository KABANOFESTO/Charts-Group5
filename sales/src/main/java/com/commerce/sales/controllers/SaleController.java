package com.commerce.sales.controllers;

import com.commerce.sales.models.Sales;
import com.commerce.sales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping("/date-range")
    public List<Sales> getSalesByDateRange(@RequestParam String startDate, @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return saleService.getSalesByDateRange(start, end);
    }
//adding sales
    @PostMapping
    public Sales addSale(@RequestBody Sales sale) {
        return saleService.addSale(sale);
    }
}
