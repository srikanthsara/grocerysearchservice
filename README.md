# grocerysearchservice


#### Swagger url:http://localhost:8762/grocerysearchservice/swagger-ui/index.html

### Implemented Dynamic search mechanisum ,one intelligent filter API #####
### /products/filter ####

### REQUEST JSON EXAMPLES

Search By Keyword

{

	"keyword": "rice"

}

Search By Brand

{

	"brand": "Apple"

}


Search By Category + Price

{

	"category": "Grocery",
    "minPrice": 500,
	"maxPrice": 3000
	
}


Search With Sorting

{

	"keyword": "milk",
	"sortBy": "price",
	"sortDirection": "asc"
	
}

Pagination Example

{
	
	"keyword": "rice",
	"pageNumber": 0,
	"pageSize": 5
	
	
}


COMPLEX AMAZON-LIKE FILTER

{
	
	"keyword": "iphone",
	"brand": "Apple",
	"minPrice": 40000,
	"maxPrice": 100000,
	"inStock": true,
	"sortBy": "price",
	"sortDirection": "asc",
	"pageNumber": 0,
	"pageSize": 10
	

}

RESPONSE FORMAT

{

  "content": [
    {
      "productId": "PROD100",
      "productName": "iPhone 15"
    }
  ],

  "totalElements": 1,
  "totalPages": 1,
  "size": 10,
  "number": 0
  
}