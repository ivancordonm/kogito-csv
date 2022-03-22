package org.acme.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.server.Client;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostalCodesService {

    private final Map<String, String> postalCodes;

    public String getPostalCode(String city) {
        String postalCode = postalCodes.get(city);
        log.debug("Postal code for {} is {}", city, postalCode);
        return postalCode;
    }

    public String getPostalCode(Client client) {
        String postalCode = postalCodes.get(client.getCity());
        log.debug("Postal code for {} is {}", client.getCity(), postalCode);
        return postalCode;
    }

}
