package com.example.currency.schedulers;

import com.example.currency.entities.CallResponse;
import com.example.currency.entities.CurrencyValue;
import com.example.currency.services.CurrencyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class TodaysCurrenciesScheduler {

    @Autowired
    private CurrencyValueService currencyValueService;

    private RestTemplate restTemplate = new RestTemplate();

    private String resourceUrl = "https://api.exchangeratesapi.io/latest?base=";

    private String[] targetedCurrencies = {"RON", "EUR", "USD", "GBP", "RUB", "HUF", "CHF", "CZK"};

    @Scheduled(fixedRate = 10000)
    public void updateCurrencyValueTableWithLatestCurrencies(){
        System.out.println("Started TodaysCurrencies Scheduler");

        if(currencyValueService.getAll().size() == 0){
            this.getActualCurrencies();
        } else {
            currencyValueService.deleteAll();
            this.getActualCurrencies();
        }
    }

    public void getActualCurrencies(){
        for(int i = 0; i < targetedCurrencies.length; i++){
            String currency = targetedCurrencies[i];

            ResponseEntity<CallResponse> apiResponse = restTemplate.getForEntity(resourceUrl + currency, CallResponse.class);

            Map<String, Double> rates = apiResponse.getBody().getRates();

            Double RON = rates.get("RON");
            if(RON == null) RON = 1D;
            Double EUR = rates.get("EUR");
            if(EUR == null) EUR = 1D;
            Double USD = rates.get("USD");
            if(USD == null) USD = 1D;
            Double GBP = rates.get("GBP");
            if(GBP == null) GBP = 1D;
            Double RUB = rates.get("RUB");
            if(RUB == null) RUB = 1D;
            Double HUF = rates.get("HUF");
            if(HUF == null) HUF = 1D;
            Double CHF = rates.get("CHF");
            if(CHF == null) CHF = 1D;
            Double CZK = rates.get("CZK");
            if(CZK == null) CZK = 1D;

            CurrencyValue currencyValue = new CurrencyValue(currency, RON, EUR, USD, GBP, RUB, HUF, CHF, CZK);

            currencyValueService.add(currencyValue);
        }
    }
}
