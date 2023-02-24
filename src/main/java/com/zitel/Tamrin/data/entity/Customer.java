package com.zitel.Tamrin.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer_tbl")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Long identityNumber;
    private String firstName;
    private String lastName;
    private LocalDateTime registerDate;

    public Customer(String firstName, String lastName, LocalDateTime registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerDate = registerDate;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identityNumber=" + identityNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
