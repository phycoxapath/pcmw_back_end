package indi.gd.pcmw.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Vaccine {
    private int id;
    private String vaccineName;
    private BigDecimal vaccinePrice;
    private String vaccineDescription;
    private Byte vaccinateDay;
    private String prepareCompany;
    private int hospId;
}
