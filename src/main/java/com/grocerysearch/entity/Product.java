package com.grocerysearch.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
        name = "product_master",
        indexes = {

                @Index(name = "idx_product_name",
                        columnList = "product_name"),

                @Index(name = "idx_category",
                        columnList = "category"),

                @Index(name = "idx_brand",
                        columnList = "brand"),

                @Index(name = "idx_price",
                        columnList = "price")
        }
)


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name")
    private String productName;

    private String category;

    private String brand;

    @Column(length = 3000)
    private String description;

    private Double price;

    private String currency;

    @Column(name = "available_quantity")
    private Integer availableQuantity;

    private Double rating;

    @Column(name = "in_stock")
    private Boolean inStock;
}