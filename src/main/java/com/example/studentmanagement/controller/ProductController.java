package com.example.studentmanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/detail/{id}")
    public String productDetail(@PathVariable int id) {

        if (id <= 0) {
            return "Product ID khong hop le";
        }

        return "Product ID = " + id;
    }

    @GetMapping("/category")
    public String category(@RequestParam(required = false) String name) {

        if (name == null || name.isEmpty()) {
            return "Category khong hop le";
        }

        return "Category = " + name;
    }
}