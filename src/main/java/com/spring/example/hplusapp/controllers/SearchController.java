package com.spring.example.hplusapp.controllers;

import com.spring.example.hplusapp.beans.Product;
import com.spring.example.hplusapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class SearchController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/search")
    public Callable<String> getSearch(@RequestParam("search") String search, Model model, HttpServletRequest request){
        System.out.println("in Search Controller");
        System.out.println("Search Criteria: " + search);
        System.out.println("Async supported in the application: "+request.isAsyncSupported());
        System.out.println("Thread from the servlet container: "+ Thread.currentThread().getName());

        return ()->{
            Thread.sleep(500);
            System.out.println("Thread from the Spring mvc task executor: "+ Thread.currentThread().getName());
            List<Product> products = new ArrayList<>();
            products = productRepository.searchByName(search);
            model.addAttribute("products", products);
            return "search";
        };

    }

}
