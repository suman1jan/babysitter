package com.ohiohealth.babysitter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.babysitter.model.BabySitter;
import com.ohiohealth.babysitter.service.BabySitterService;

import io.micrometer.core.lang.NonNull;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/babysitter")
@Slf4j
public class BabySitterController {

    private BabySitterService service;

    public BabySitterController(BabySitterService service) {
        this.service = service;
    }

    @GetMapping("/charge")
    public BabySitter getCharge(@NonNull @RequestParam(value = "numberOfNight") int numberOfNight) throws Exception{
        log.info("Inside controller numberOfNight {} ", numberOfNight);
        return service.getCharge(numberOfNight);
    }

}

