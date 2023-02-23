package com.zitel.Tamrin.data.repository;

import com.zitel.Tamrin.data.entity.Product;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findProductById(@Param("id") Long id);
    List<Product> searchProductByName(@Param("name") String name);

}
