package dockercomposeassignment.dockerassignment.service;

import java.util.List;

import dockercomposeassignment.dockerassignment.entity.Product;

public interface ProductService {

	List<Product> getProduct();

	Product addProduct(Product product);
	
	

}
