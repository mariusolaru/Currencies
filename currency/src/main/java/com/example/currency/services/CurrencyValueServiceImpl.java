package com.example.currency.services;

import com.example.currency.entities.CurrencyValue;
import com.example.currency.repositories.CurrencyValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyValueServiceImpl implements CurrencyValueService {

    @Autowired
    private CurrencyValueRepository currencyValueRepository;

    @Override
    public List<CurrencyValue> getAll() {
        return currencyValueRepository.findAll();
    }

    @Override
    public CurrencyValue add(CurrencyValue currencyValue) {
        return currencyValueRepository.save(currencyValue);
    }

    @Override
    public void deleteAll() {
        currencyValueRepository.deleteAll();
    }


}
