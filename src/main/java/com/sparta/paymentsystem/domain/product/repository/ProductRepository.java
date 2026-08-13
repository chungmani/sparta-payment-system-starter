package com.sparta.paymentsystem.domain.product.repository;

import com.sparta.paymentsystem.domain.product.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
