package com.ohiohealth.babysitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohiohealth.babysitter.config.ConfigProperties;
import com.ohiohealth.babysitter.model.BabySitter;

@Service
public class BabySitterService {

    @Autowired
    ConfigProperties prop;

    private final String currencySymbol = "$";

    public BabySitter getCharge(int numberOfNight) throws Exception {

        float cost = ((prop.getBedtime() * prop.getBedtimerate()) +
                (prop.getMidnight() * prop.getMidnightrate()) +
                (prop.getLatenight() * prop.getLaterate())) * numberOfNight;

        BabySitter babySitter = BabySitter.builder()
                .numberOfNight(numberOfNight)
                .charge(currencySymbol + cost)
                .build();

        return babySitter;
    }

}

