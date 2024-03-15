package com.example.Tellez.Service;

import com.example.Tellez.Entity.Local;
import com.example.Tellez.Repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService {
    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAll() {
        return repository.findAll();
    }
}