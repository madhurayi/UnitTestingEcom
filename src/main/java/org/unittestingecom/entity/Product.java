package org.unittestingecom.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Product name cannot be null")
    private String name;
    @NotNull(message = "Product price cannot be null")
    @Min(value = 0,message = "Value must be greater than 0")
    @Max(value = 100, message = "Value should be less than 100")
    private Integer price;
    @Size(max = 5,message = "Description cannot exceed 5 characters")
    private String description;
    private Integer stock;
    public Product(){}
    public Product(String name, Integer price,String description, Integer stock){
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
