package com.angadjava.angadjavaaws.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSDemoContrller {

    @Value("${my-first-key}")
    private String apiKeyValue1;

    @GetMapping("/key")
    public String getString(){
        return apiKeyValue1;
    }
}
