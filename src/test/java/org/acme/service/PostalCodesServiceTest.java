package org.acme.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PostalCodesServiceTest {

    @Autowired
    PostalCodesService postalCodesService;

    @Test
    void getPostalCode() {

        String postalCode = postalCodesService.getPostalCode("Cenicientos");
        assertEquals("28650", postalCode);
    }
}
