package com.zitel.Tamrin.data.service;

import com.zitel.Tamrin.data.entity.Order;
import com.zitel.Tamrin.data.repository.CustomerRepsitory;
import com.zitel.Tamrin.data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    OrderToProductService otpService;

    @Autowired
    ProductService productService;

    public Order addOrder(Long customerId,Long productId,Order order){
        var customer=customerService.getCustomerById(customerId);
        var product=productService.getProductById(productId);
        product.setStock(product.getStock()-1);
        order.setCustomer(customer);
        orderRepository.save(order);
        otpService.addOrderToProduct(order,product);
        return order;
    }

    public List<Order> getOrderByCustomerId(Long customerId){
        return orderRepository.getOrdersByCustomerId(customerId);
    }



}
