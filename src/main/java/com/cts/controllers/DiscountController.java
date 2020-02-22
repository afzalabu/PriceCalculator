package com.cts.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.model.Product;
import com.cts.services.DiscountService;

@Controller
public class DiscountController {

	@Autowired
	private DiscountService discountService;

	@RequestMapping(value = "/getDiscountedPrice", method = RequestMethod.GET)
	public String discountPage(@ModelAttribute("product") Product product) {

		return "calculatediscount";

	}

	@RequestMapping(value = "/calculateDiscountedPrice", method = RequestMethod.GET)
	public String calculateDiscount(@Valid @ModelAttribute("product") Product product, BindingResult result, ModelMap model) {
		
		double discount = discountService.calculateDiscount(product);
		
		model.addAttribute("finalPrice", discount);
		
		if (result.hasErrors())
			return "calculatediscount";

		return "finalprice";

	}
	
	@ModelAttribute("productTypeList")
	public List<String> populateProductType(){
		
		List<String> productTypeList = new ArrayList<>();
		
		productTypeList.add("Electronic");
		productTypeList.add("Apparels");
		productTypeList.add("Toys");
		
		return productTypeList;
		
	}

}
