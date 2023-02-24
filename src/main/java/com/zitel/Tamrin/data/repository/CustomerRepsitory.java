package com.zitel.Tamrin.data.repository;

import com.zitel.Tamrin.data.entity.Customer;
import com.zitel.Tamrin.data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepsitory extends JpaRepository<Customer,Long> {
    Customer findCustomerByIdentityNumber(Long id);
    @Query("from Customer c where c.firstName like :name or c.lastName like :name")
    List<Customer> searchCustomer(@Param("name") String fullName);

}
