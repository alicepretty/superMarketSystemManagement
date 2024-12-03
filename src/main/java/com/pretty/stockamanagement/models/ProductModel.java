package com.pretty.stockamanagement.models;

import jakarta.persistence.*;
import jdk.jfr.Category;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(generator = "uuid") // Use custom UUID generator
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "productId", columnDefinition = "varchar(255)") // Explicitly define column type

    private String productId;
    private String productName;
    private LocalDate createdDate;
    private LocalDate expiredDate;

    // Constructors
    public ProductModel() {}

    public ProductModel(String productName, LocalDate createdDate, LocalDate expiredDate) {
        this.productName = productName;
        this.createdDate = createdDate;
        this.expiredDate = expiredDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

}
