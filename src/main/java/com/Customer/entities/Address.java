package com.Customer.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Version;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String country;
    private String pincode;


}
