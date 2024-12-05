package com.pretty.stockamanagement.services;
import com.pretty.stockamanagement.ExceptionsHandling.ApiRequestExceptions.DuplicateExceptions;
import com.pretty.stockamanagement.ExceptionsHandling.ApiRequestExceptions.NotFoundExceptions;
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
    public List<ProductModel>getAllProducts()  {
//
        if (productRepository.findAll().isEmpty()) {
        throw new NotFoundExceptions("No Products in the database");
        }
        
        return productRepository.findAll();
    }
 //creating a product
    public ProductModel createProduct(ProductModel product){

        if (productRepository.findByProductName(product.getProductName()).isPresent()) {
            throw new DuplicateExceptions("product by this name: "+product.getProductName()  + " "+ "already exist");

        }

        return productRepository.save(product);
    }
}



