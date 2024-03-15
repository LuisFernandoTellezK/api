package com.example.Tellez.Repository;

     import com.example.Tellez.Entity.Product;
     import org.springframework.data.jpa.repository.JpaRepository;
     import org.springframework.stereotype.Repository;

     @Repository
     public interface ProductRepository extends JpaRepository<Product, Long> {
     }