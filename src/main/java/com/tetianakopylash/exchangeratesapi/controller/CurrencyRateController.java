package com.tetianakopylash.exchangeratesapi.controller;

import com.tetianakopylash.exchangeratesapi.domain.CurrencyRate;
import com.tetianakopylash.exchangeratesapi.repository.RateRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CurrencyRateController {

    private final RateRepository repository;

    public CurrencyRateController(RateRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/currency-rates")
    public List<CurrencyRate> getCurrencyRates(
            @RequestParam(name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return repository.findByDate(date);
    }
}
