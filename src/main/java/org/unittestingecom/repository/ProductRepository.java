package org.unittestingecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unittestingecom.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
