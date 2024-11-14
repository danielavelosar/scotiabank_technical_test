package com.scotiabank.scotiabank_test.domain.repository;

import com.scotiabank.scotiabank_test.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product>  getProductById(int productId);

    void update(int idProduct, String updatedName, Double updatedPrice);
    Product save(Product product);
    void delete(int productId);


}
