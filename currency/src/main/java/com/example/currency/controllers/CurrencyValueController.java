package com.example.currency.controllers;

import com.example.currency.entities.CallResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/currency-value")
public class CurrencyValueController {

    @GetMapping
    public String getHealth(){
        return "OK";
    }

}
