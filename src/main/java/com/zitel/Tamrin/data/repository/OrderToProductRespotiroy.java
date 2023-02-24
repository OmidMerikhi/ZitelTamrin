package com.zitel.Tamrin.data.repository;

import com.zitel.Tamrin.data.entity.OrderToProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderToProductRespotiroy extends JpaRepository<OrderToProduct,Long> {
}
