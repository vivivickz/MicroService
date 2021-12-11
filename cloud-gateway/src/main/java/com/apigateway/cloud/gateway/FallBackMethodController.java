package com.apigateway.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/booklendingservicefallback")
	public String bookLendingServiceFallBackMethod() {
		return "Book Lending service taking longer than expected"+
				"Please try again later";
	}
	@GetMapping("/bookinventoryservicefallback")
	public String bookInventoryServiceFallBackMethod() {
		return "Book Inventory service taking longer than expected"+
				"Please try again later";
	}
	@GetMapping("/bookpurchaseservicefallback")
	public String bookPurchaseServiceFallBackMethod() {
		return "Book Lending service taking longer than expected"+
				"Please try again later";
	}
}
