package com.example.currency.entities;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity
public class CurrencyValue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String currency;

    @Column(name = "value_in_RON")
    public Double valueInRON;

    @Column(name = "value_in_EUR")
    public Double valueInEUR;

    @Column(name = "value_in_USD")
    public Double valueInUSD;

    @Column(name = "value_in_GBP")
    public Double valueInGBP;

    @Column(name = "value_in_RUB")
    public Double valueInRUB;

    @Column(name = "value_in_HUF")
    public Double valueInHUF;

    @Column(name = "value_in_CHF")
    public Double valueInCHF;

    @Column(name = "value_in_CZK")
    public Double valueInCZK;

    public CurrencyValue(){

    }

    public CurrencyValue(String currency, Double valueInRON, Double valueInEUR, Double valueInUSD, Double valueInGBP, Double valueInRUB, Double valueInHUF, Double valueInCHF, Double valueInCZK) {
        this.currency = currency;
        this.valueInRON = valueInRON;
        this.valueInEUR = valueInEUR;
        this.valueInUSD = valueInUSD;
        this.valueInGBP = valueInGBP;
        this.valueInRUB = valueInRUB;
        this.valueInHUF = valueInHUF;
        this.valueInCHF = valueInCHF;
        this.valueInCZK = valueInCZK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getValueInRON() {
        return valueInRON;
    }

    public void setValueInRON(Double valueInRON) {
        this.valueInRON = valueInRON;
    }

    public Double getValueInEUR() {
        return valueInEUR;
    }

    public void setValueInEUR(Double valueInEUR) {
        this.valueInEUR = valueInEUR;
    }

    public Double getValueInUSD() {
        return valueInUSD;
    }

    public void setValueInUSD(Double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }

    public Double getValueInGBP() {
        return valueInGBP;
    }

    public void setValueInGBP(Double valueInGBP) {
        this.valueInGBP = valueInGBP;
    }

    public Double getValueInRUB() {
        return valueInRUB;
    }

    public void setValueInRUB(Double valueInRUB) {
        this.valueInRUB = valueInRUB;
    }

    public Double getValueInHUF() {
        return valueInHUF;
    }

    public void setValueInHUF(Double valueInHUF) {
        this.valueInHUF = valueInHUF;
    }

    public Double getValueInCHF() {
        return valueInCHF;
    }

    public void setValueInCHF(Double valueInCHF) {
        this.valueInCHF = valueInCHF;
    }

    public Double getValueInCZK() {
        return valueInCZK;
    }

    public void setValueInCZK(Double valueInCZK) {
        this.valueInCZK = valueInCZK;
    }
}
