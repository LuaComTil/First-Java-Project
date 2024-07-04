package com.lfr.investments.controller;

import com.lfr.investments.controller.dto.CreateStockDto;
import com.lfr.investments.entity.User;
import com.lfr.investments.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/stocks")
public class StockController {
    private StockService stockService;

    private StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping
    public ResponseEntity<User> createStock(@RequestBody CreateStockDto createStockDto) {
        stockService.createStock(createStockDto);
        return ResponseEntity.ok().build();
    }
}
