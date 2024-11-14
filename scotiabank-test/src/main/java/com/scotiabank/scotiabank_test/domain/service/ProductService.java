package com.scotiabank.scotiabank_test.domain.service;

import com.scotiabank.scotiabank_test.domain.repository.ProductRepository;
import com.scotiabank.scotiabank_test.persistence.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAll(){
        return productRepository.getAll();
    }
    public Optional<Product> getProductById(@PathVariable("id") int idProduct){
        return productRepository.getProductById(idProduct);
    }
    public boolean update(Product product){
        return getProductById(product.getIdProduct()).map(updatedProduct -> {
            productRepository.update(product.getIdProduct(), product.getName(), product.getPrice());
            return true;
        }).orElse(false);

    }
    public Product save(Product product){
        return productRepository.save(product);
    }
    public boolean delete(int productId){
        return getProductById(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);


    }

}
