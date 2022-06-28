package dockercomposeassignment.dockerassignment.service;

import java.util.List;

import dockercomposeassignment.dockerassignment.entity.Product;
import dockercomposeassignment.dockerassignment.repository.ProductRepository;


import org.springframework.stereotype.Service;



@Service
public class ProductServiceImpl implements ProductService {
	
	
	private ProductRepository productRepository;
	

	public ProductServiceImpl(ProductRepository productRepository) {
		
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getProduct() {
		
		return productRepository.findAll() ;
	}

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
}
