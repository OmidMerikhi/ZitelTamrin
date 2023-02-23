package com.zitel.Tamrin.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_product_tbl")
public class OrderToProduct {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "order_id")
    Order order;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "product_id")
    Product product;

    public OrderToProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public OrderToProduct() {
    }

    @Override
    public String toString() {
        return "OrderToProduct{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
