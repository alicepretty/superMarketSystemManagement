package com.pretty.stockamanagement.repository;
import com.pretty.stockamanagement.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, String> {
}
