package com.zitel.Tamrin.data.service;

import com.zitel.Tamrin.data.entity.Customer;
import com.zitel.Tamrin.data.repository.CustomerRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepsitory customerRepsitory;

    public Customer addCustomer(Customer customer){
        return customerRepsitory.save(customer);
    }

    public Customer editCustomer(Customer customer){
        return customerRepsitory.save(customer);
    }

    public List<Customer> getAllCustomer(){
        return customerRepsitory.findAll();
    }

    public List<Customer> searchCustomerByName(String fullName){
        return customerRepsitory.searchCustomer("%"+fullName+"%");
    }

    public Customer getCustomerById(Long id){
        return customerRepsitory.findCustomerByIdentityNumber(id);
    }
}
