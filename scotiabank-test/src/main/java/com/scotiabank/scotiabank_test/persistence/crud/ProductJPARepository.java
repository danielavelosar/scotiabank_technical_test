package com.scotiabank.scotiabank_test.persistence.crud;

import com.scotiabank.scotiabank_test.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

}
