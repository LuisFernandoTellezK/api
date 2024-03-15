package com.example.Tellez.Service;

import com.example.Tellez.Entity.Product;
import com.example.Tellez.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}