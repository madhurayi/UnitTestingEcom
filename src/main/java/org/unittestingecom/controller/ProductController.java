package org.unittestingecom.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.unittestingecom.entity.Product;
import org.unittestingecom.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;
    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product productRes= productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRes);
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer productId) {
        Product product= productService.findProductById(productId).get();
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
    @GetMapping("/{productName}")
    public ResponseEntity<Product> getProductByName(@PathVariable String productName) {
        Product product= productService.findProductByName(productName).get();
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}
