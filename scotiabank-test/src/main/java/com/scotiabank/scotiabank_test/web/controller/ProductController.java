package com.scotiabank.scotiabank_test.web.controller;

import com.scotiabank.scotiabank_test.domain.service.ProductService;
import com.scotiabank.scotiabank_test.persistence.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "/products")

public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable("id") int idProduct){
        return productService.getProductById(idProduct);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Product product){
        return  productService.update(product);
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int productId){
        return productService.delete(productId);


    }
}
