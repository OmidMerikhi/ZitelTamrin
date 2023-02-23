package com.zitel.Tamrin.data.service;

import com.zitel.Tamrin.data.entity.Product;
import com.zitel.Tamrin.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product editProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findProductById(id);
    }

}
