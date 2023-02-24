package com.zitel.Tamrin.view;

import com.zitel.Tamrin.data.entity.Order;
import com.zitel.Tamrin.data.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/add")
    public Order addOrder(@RequestParam("customerId") Long customerId,@RequestParam("productId") Long productId,@RequestBody Order order){
        return orderService.addOrder(customerId,productId,order);
    }

    @GetMapping("/getByCustomerId")
    public List<Order> getOrdersByCustomerId(@RequestParam("customerId") Long customerId){
        return orderService.getOrderByCustomerId(customerId);
    }

}
