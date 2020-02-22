package com.cts.model;

import javax.validation.constraints.Min;

public class Product {

	@Min(value=1,message="{productPrice.invalid}")
	private double productPrice;

	private String productType;

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

}
