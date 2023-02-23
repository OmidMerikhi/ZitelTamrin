package com.zitel.Tamrin.data.repository;

import com.zitel.Tamrin.data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
