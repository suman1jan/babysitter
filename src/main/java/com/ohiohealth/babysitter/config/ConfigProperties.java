package com.ohiohealth.babysitter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="config")
public class ConfigProperties {

    private int bedtime;
    private int midnight;
    private int latenight;
    private float bedtimerate;
    private float midnightrate;
    private float laterate;

    public int getBedtime() {
        return bedtime;
    }
    public void setBedtime(int bedtime) {
        this.bedtime = bedtime;
    }
    public int getMidnight() {
        return midnight;
    }
    public void setMidnight(int midnight) {
        this.midnight = midnight;
    }
    public int getLatenight() {
        return latenight;
    }
    public void setLatenight(int latenight) {
        this.latenight = latenight;
    }
    public float getBedtimerate() {
        return bedtimerate;
    }
    public void setBedtimerate(float bedtimerate) {
        this.bedtimerate = bedtimerate;
    }
    public float getMidnightrate() {
        return midnightrate;
    }
    public void setMidnightrate(float midnightrate) {
        this.midnightrate = midnightrate;
    }
    public float getLaterate() {
        return laterate;
    }
    public void setLaterate(float laterate) {
        this.laterate = laterate;
    }



}
