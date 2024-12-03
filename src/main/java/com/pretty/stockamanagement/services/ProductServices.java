package com.pretty.stockamanagement.services;
import com.pretty.stockamanagement.models.ProductModel;
import com.pretty.stockamanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.pretty.stockamanagement.models;
import java.util.List;

@Service
public class ProductServices {
 @Autowired
    private ProductRepository productRepository;
    public List<ProductModel>getAllProducts(){
        return productRepository.findAll();
    }
 //creating a product
    public ProductModel createProduct(ProductModel product){
        return productRepository.save(product);
    }
}



