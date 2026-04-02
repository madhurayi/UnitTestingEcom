package org.unittestingecom.service;

import org.springframework.stereotype.Service;
import org.unittestingecom.entity.Product;
import org.unittestingecom.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    public Optional<Product> findProductById(Integer id ){
        return productRepository.findById(id);
    }
    public Optional<Product> findProductByName(String name){
        return productRepository.findProductByName(name);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
