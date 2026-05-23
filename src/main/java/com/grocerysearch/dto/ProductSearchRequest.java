package com.grocerysearch.dto;

import lombok.Data;

@Data
public class ProductSearchRequest {

    private String keyword;

    private String category;

    private String brand;

    private Double minPrice;

    private Double maxPrice;

    private Boolean inStock;

    private String sortBy = "price";

    private String sortDirection = "asc";

    private Integer pageNumber = 0;

    private Integer pageSize = 10;
}