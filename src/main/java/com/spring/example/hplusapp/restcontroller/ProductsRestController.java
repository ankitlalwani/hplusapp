package com.spring.example.hplusapp.restcontroller;

import com.spring.example.hplusapp.beans.Product;
import com.spring.example.hplusapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Controller
public class ProductsRestController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/hplus/rest/products")

   /* @ResponseBody
    public List<Product> getProducts(){

        List<Product> products = new ArrayList<>();

        productRepository.findAll().forEach(product -> products.add(product));
        return products;

    }*/

   public ResponseEntity getProducts(@RequestParam("name") String name){
       List<Product> products = productRepository.searchByName(name);
       return new ResponseEntity(products, HttpStatus.OK);
    }

    @GetMapping("/hplus/rest/products/{name}")
    public ResponseEntity getProducts1(@PathVariable("name") String name){
        List<Product> products = productRepository.searchByName(name);
        return new ResponseEntity(products, HttpStatus.OK);
    }

}
