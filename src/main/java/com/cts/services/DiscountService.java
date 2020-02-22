package com.cts.services;

import org.springframework.stereotype.Service;

import com.cts.model.Product;

@Service
public interface DiscountService {
	
	double calculateDiscount(Product product);
	
}
