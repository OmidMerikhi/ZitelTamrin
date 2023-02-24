package com.zitel.Tamrin.data.repository;

import com.zitel.Tamrin.data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query("from Order o where o.customer.identityNumber=:id")
    List<Order> getOrdersByCustomerId(@Param("id") Long customerId);
}
