package com.codessrj.SPRINGBOOTPRODUCTMANAGEMENT.repository;

import com.codessrj.SPRINGBOOTPRODUCTMANAGEMENT.model.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
