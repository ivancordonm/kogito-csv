package org.acme.utils;

import lombok.SneakyThrows;
import org.acme.domain.PostalCode;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileReader;
import java.util.List;


class CsvManagerTest {

    @SneakyThrows
    @Test
    void test() {

        Resource resource = new ClassPathResource("csv/postal_codes.csv");

        CsvManager csvManager = new CsvManager();
        List<PostalCode> postalCodeList = csvManager.convertFileToTargetObject(new FileReader(resource.getFile()),
                PostalCode.class);
        System.out.println(postalCodeList.get(0));
    }

}
