package org.acme.utils;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class CsvManager {

    public <T> List<T> convertFileToTargetObject(FileReader file, Class<T> clazz) {
        return new CsvToBeanBuilder<T>(file)
                .withType(clazz)
                .build()
                .parse();
    }

}
