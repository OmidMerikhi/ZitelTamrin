package com.zitel.Tamrin.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product_tbl")
@Data
@NamedQueries({@NamedQuery(name = "findProductById",query = "from Product p where p.id=:id"),
                @NamedQuery(name = "searchProductByName",query = "from Product p where p.name like :name")})
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int stock;
    private Double price;

    @OneToMany(mappedBy = "product")
    private List<OrderToProduct> orderToProducts=new ArrayList<>();

    public Product(String name, int stock, Double price, List<OrderToProduct> orderToProducts) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.orderToProducts = orderToProducts;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", orderToProducts=" + orderToProducts +
                '}';
    }
}
