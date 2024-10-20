package com.ShopApp.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShopApp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
