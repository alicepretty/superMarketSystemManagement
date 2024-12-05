package com.pretty.stockamanagement.controllers;

import com.pretty.stockamanagement.ExceptionsHandling.ApiRequestExceptions.NotFoundExceptions;
import com.pretty.stockamanagement.ExceptionsHandling.ErrorResponse;
import com.pretty.stockamanagement.models.ProductModel;
import com.pretty.stockamanagement.services.ProductServices;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
@RequestMapping(path = "/api/products")
public class ProductController {
    private final ProductServices productServices;
    @Autowired
    public ProductController(ProductServices productServices){
        this.productServices =productServices;
    }
    @GetMapping
    public ResponseEntity<?>getAllProducts(){
        try {
            List<ProductModel>products = productServices.getAllProducts();{
                return ResponseEntity.ok(products);
            }
        }
        catch (NotFoundExceptions e){
            ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), String.valueOf(HttpStatus.NOT_FOUND.value()));
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }

    }


    @PostMapping
    public ProductModel createProduct(@RequestBody ProductModel product){
        return productServices.createProduct(product);
    }

    @PutMapping
    public void updateProduct(){
        log.info("TEST LOG");
    }

}
