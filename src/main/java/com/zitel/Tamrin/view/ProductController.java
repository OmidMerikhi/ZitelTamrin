package com.zitel.Tamrin.view;

import com.zitel.Tamrin.data.entity.Product;
import com.zitel.Tamrin.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/edit")
    public Product editProduct(@RequestBody Product product){
        return productService.editProduct(product);
    }

    @GetMapping("/get")
    public Product getProductById(@RequestParam("id") Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }



}
