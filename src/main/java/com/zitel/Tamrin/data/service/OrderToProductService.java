package com.zitel.Tamrin.data.service;

import com.zitel.Tamrin.data.entity.Order;
import com.zitel.Tamrin.data.entity.OrderToProduct;
import com.zitel.Tamrin.data.entity.Product;
import com.zitel.Tamrin.data.repository.OrderToProductRespotiroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderToProductService {
    @Autowired
    OrderToProductRespotiroy otpRepository;
    public OrderToProduct addOrderToProduct(Order order, Product product){
        var otp=new OrderToProduct(order,product);
        return otpRepository.save(otp);
    }

}
