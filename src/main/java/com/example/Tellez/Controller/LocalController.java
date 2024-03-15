package com.example.Tellez.Controller;

import com.example.Tellez.Entity.Local;
import com.example.Tellez.Service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/local")
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAll")
    public List<Local> findAll() {
        return localService.findAll();
    }
}