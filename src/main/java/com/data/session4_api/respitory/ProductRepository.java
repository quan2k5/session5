package com.data.session4_api.respitory;
import com.data.session4_api.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {
}