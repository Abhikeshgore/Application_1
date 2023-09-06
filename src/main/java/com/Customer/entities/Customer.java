package com.Customer.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;



@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name="customer_id")
    private UUID CustomerId ;

    @Column(name="firstname")
    private String FirstName;

    @Column(name="lastname")
    private String LastName;

    @Column(name="age")
    private int age;

    @Embedded
    private Address address;

    @CreationTimestamp
    @Column(name="creation_time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name="update_time")
    private LocalDateTime updatedTime;

    private Integer version;


}
