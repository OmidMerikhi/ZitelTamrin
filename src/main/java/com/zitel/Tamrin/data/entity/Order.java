package com.zitel.Tamrin.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "order_tbl")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private int TrackNumber;
    private Double totalPrice;
    private LocalDateTime orderDate;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    List<OrderToProduct> orderToProducts=new ArrayList<>();

    public Order(int trackNumber, Double totalPrice, LocalDateTime orderDate, Customer customer, List<OrderToProduct> orderToProducts) {
        TrackNumber = trackNumber;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.customer = customer;
        this.orderToProducts = orderToProducts;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", TrackNumber=" + TrackNumber +
                ", totalPrice=" + totalPrice +
                ", orderDate=" + orderDate +
                '}';
    }
}
