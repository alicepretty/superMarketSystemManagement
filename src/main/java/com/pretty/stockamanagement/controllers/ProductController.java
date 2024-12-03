package com.pretty.stockamanagement.controllers;

import com.pretty.stockamanagement.models.ProductModel;
import com.pretty.stockamanagement.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {
    private final ProductServices productServices;
    @Autowired
    public ProductController(ProductServices productServices){
        this.productServices =productServices;
    }
    @GetMapping
    public List<ProductModel> getAllProducts(){
      return   productServices.getAllProducts();
    }

    @PostMapping
    public ProductModel createProduct(@RequestBody ProductModel product){
        return productServices.createProduct(product);
    }
}
