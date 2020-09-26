package com.ohiohealth.babysitter.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import com.ohiohealth.babysitter.model.BabySitter;
import com.ohiohealth.babysitter.service.BabySitterService;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class BabySitterControllerTest {

    @Mock
    BabySitterService babySitterService;

    @Test
    void testController() {
        try {
            BabySitter babySitter = BabySitter.builder()
                    .numberOfNight(1)
                    .charge("$100")
                    .build();
            when(babySitterService.getCharge(anyInt())).thenReturn(babySitter);

            BabySitterController babySitterController = new BabySitterController(babySitterService);
            BabySitter bean = babySitterController.getCharge(2);
            System.out.println(bean);
            Assertions.assertNotNull(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

