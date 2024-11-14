package com.scotiabank.scotiabank_test.persistence;

import com.scotiabank.scotiabank_test.persistence.crud.ProductJPARepository;
import com.scotiabank.scotiabank_test.persistence.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements com.scotiabank.scotiabank_test.domain.repository.ProductRepository {
    @Autowired
    private ProductJPARepository productJPARepository;
    public List<Product> getAll(){
        System.out.println("holiii");
        return (List<Product>) productJPARepository.findAll();
    }

    public Optional<Product> getProductById( int idProduct ){
        return productJPARepository.findById(idProduct);
    }

    public void update(int idProduct, String updatedName, Double updatedPrice){
        Optional<Product> productOptional =  productJPARepository.findById(idProduct);
        if(productOptional.isPresent()){
            Product product = productOptional.get();
            if (updatedName != null && !updatedName.trim().isEmpty()){
                product.setName(updatedName);
            }
            if (updatedPrice != null){
                product.setPrice(updatedPrice);
            }
            productJPARepository.save(product);

        }
    }

    public Product save(Product product){
        return  productJPARepository.save(product);
    }

    public void delete(int idProduct){
        productJPARepository.deleteById(idProduct);
    }

}
