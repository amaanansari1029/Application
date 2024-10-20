package com.ShopApp.respository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ShopApp.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
