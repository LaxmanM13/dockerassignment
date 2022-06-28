package dockercomposeassignment.dockerassignment.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dockercomposeassignment.dockerassignment.entity.Product;
import dockercomposeassignment.dockerassignment.service.ProductService;




@RestController
public class ProductController {
	
	
	private ProductService productService;
	
	
	public ProductController(ProductService productService) {
		
		this.productService = productService;
	}

    @GetMapping("/getallproduct")
	public List<Product> getProduct()
	{
		return this.productService.getProduct();
	}
    
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product)
    {
    	return this.productService.addProduct(product);
    }
}
