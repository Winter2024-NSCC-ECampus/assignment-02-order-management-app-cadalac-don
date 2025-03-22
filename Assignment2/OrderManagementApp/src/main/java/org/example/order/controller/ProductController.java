package org.example.order.controller;

import org.example.order.model.Product;
import org.example.order.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository= productRepository;
    }

    @GetMapping("/")
    public String getItems(Model model){

        List<Product> items = productRepository.findAll();
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/product/ascending")
    public String getAccentingItems(Model model){
        List<Product> items = productRepository.findAllByOrderByIdAsc();
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/product/descending")
    public String getDescendingItems(Model model){
        List<Product> items = productRepository.findAllByOrderByIdDesc();
        model.addAttribute("items", items);
        return "index";
    }
}
