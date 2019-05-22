package com.example.currency.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class CallResponse implements Serializable {

    public String base;

    public Map<String, Double> rates;

    public Date date;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
