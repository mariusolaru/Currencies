package com.example.currency.repositories;

import com.example.currency.entities.CurrencyValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyValueRepository extends JpaRepository<CurrencyValue, Long> {
}
