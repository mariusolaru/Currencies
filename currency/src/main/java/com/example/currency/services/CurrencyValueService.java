package com.example.currency.services;

import com.example.currency.entities.CurrencyValue;

import java.util.List;

public interface CurrencyValueService {

    List<CurrencyValue> getAll();

    CurrencyValue add(CurrencyValue currencyValue);

    void deleteAll();

}
