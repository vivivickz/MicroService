package com.springMicroService.bookPurchase.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springMicroService.bookPurchase.Entity.BookPurchase;
import com.springMicroService.bookPurchase.Service.BookPurchaseService;

@RestController
@RequestMapping("/bookpurchase")
public class BookPurchaseController {

	private BookPurchaseService bookPurchaseService;

	public BookPurchaseController(BookPurchaseService bookPurchaseService) {
		super();
		this.bookPurchaseService = bookPurchaseService;
	}
	
	@PostMapping("/")
	public List<BookPurchase> saveData(@RequestBody List<BookPurchase> bookPurchase){
		return bookPurchaseService.saveData(bookPurchase);
	}
	
	@GetMapping("/bookpurchaselist")
	public List<BookPurchase> getAllData(){
		return bookPurchaseService.getAllData();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BookPurchase> getBookPurchaseById(@PathVariable("id") long bookPurchaseId){
		return new ResponseEntity<BookPurchase>(bookPurchaseService.getBookPurchaseId(bookPurchaseId),HttpStatus.OK);
	}
	
}
