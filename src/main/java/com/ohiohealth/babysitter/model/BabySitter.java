package com.ohiohealth.babysitter.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BabySitter {

    private int numberOfNight;
    private String charge;
}
