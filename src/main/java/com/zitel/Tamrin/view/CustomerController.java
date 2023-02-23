package com.zitel.Tamrin.view;

import com.zitel.Tamrin.data.entity.Customer;
import com.zitel.Tamrin.data.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping("/edit")
    public Customer editCustomer(@RequestBody Customer customer){
        return customerService.editCustomer(customer);
    }

    @GetMapping("/get")
    public Customer customer(@RequestParam("id") Long id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("/search")
    public List<Customer> searchCustomerByFullName(@RequestParam("fullName") String fullName){
        return customerService.searchCustomerByName(fullName);
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }


}
