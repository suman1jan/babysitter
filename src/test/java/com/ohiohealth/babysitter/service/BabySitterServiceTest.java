package com.ohiohealth.babysitter.service;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ohiohealth.babysitter.model.BabySitter;
import com.ohiohealth.babysitter.service.BabySitterService;

@ExtendWith(MockitoExtension.class)
public class BabySitterServiceTest {

    @Mock
    BabySitterService babySitterService;

    @Test
    void testService() {
        try {
            BabySitter babySitter = BabySitter.builder()
                    .numberOfNight(1)
                    .charge("$100")
                    .build();
            when(babySitterService.getCharge(anyInt())).thenReturn(babySitter);

            BabySitter bean = babySitterService.getCharge(2);
            System.out.println(bean);
            Assertions.assertNotNull(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

