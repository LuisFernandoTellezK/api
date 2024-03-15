package com.example.Tellez.Controller;

     import com.example.Tellez.Entity.Product;
     import com.example.Tellez.Service.ProductService;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.web.bind.annotation.GetMapping;
     import org.springframework.web.bind.annotation.RequestMapping;
     import org.springframework.web.bind.annotation.RestController;

     import java.util.List;

     @RestController
     @RequestMapping("api/product")
     public class ProductController {
         @Autowired
         ProductService productService;

         @GetMapping("/findAll")
         public List<Product> findAll() {
             return productService.findAll();
         }
     }