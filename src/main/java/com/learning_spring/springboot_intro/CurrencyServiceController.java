package com.learning_spring.springboot_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;
    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration getCurrencyService() {
        return currencyServiceConfiguration;
    }
}
