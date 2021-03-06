package org.acme.domain;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostalCode {

    @CsvBindByPosition(position = 0)
    private String postalCode;

    @CsvBindByPosition(position = 1)
    private String municipalityId;

    @CsvBindByPosition(position = 2)
    private String city;

}
