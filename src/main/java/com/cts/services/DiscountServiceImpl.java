package com.cts.services;

import org.springframework.stereotype.Component;

import com.cts.model.Product;

@Component
public class DiscountServiceImpl implements DiscountService {

	public double calculateDiscount(Product product) {

		double finalPrice = 0.0;
		
		if(product.getProductType().equalsIgnoreCase("Electronic"))
			finalPrice = product.getProductPrice() - (product.getProductPrice() * 0.25);
		
		if(product.getProductType().equalsIgnoreCase("Apparels"))
			finalPrice = product.getProductPrice() - (product.getProductPrice() * 0.10);
		
		if(product.getProductType().equalsIgnoreCase("Toys"))
			finalPrice = product.getProductPrice() - (product.getProductPrice() * 0.50);
		
		return finalPrice;
	}

}
