package com.tetianakopylash.exchangeratesapi.repository;

import com.tetianakopylash.exchangeratesapi.domain.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<CurrencyRate, Long> {

    List<CurrencyRate> findByDate(LocalDate date);

}

