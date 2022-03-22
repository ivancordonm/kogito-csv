package org.acme.service;

import org.acme.domain.PostalCode;
import org.acme.utils.CsvManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class PostalCodesConfig {

    @Bean
    Map<String, String> getPostalCodes() throws IOException {
        Resource resource = new ClassPathResource("csv/postal_codes.csv");

        CsvManager      csvManager     = new CsvManager();
        List<PostalCode> postalCodeList = csvManager.convertFileToTargetObject(new FileReader(resource.getFile()),
                PostalCode.class);

        Map<String, String> postalCodeMap = new HashMap<>();
        for (PostalCode postalCode : postalCodeList) {
            postalCodeMap.put(postalCode.getCity(), postalCode.getPostalCode());
        }

        return postalCodeMap;

    }

}
