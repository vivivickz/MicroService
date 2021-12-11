package com.springMicroService.bookInventory.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springMicroService.bookInventory.Entity.BookInventory;
import com.springMicroService.bookInventory.Service.BookInventoryService;

@RestController
@RequestMapping("/bookinventory")
public class BookInventoryController {

	private BookInventoryService bookInventoryService;

	public BookInventoryController(BookInventoryService bookInventoryService) {
		super();
		this.bookInventoryService = bookInventoryService;
	}
	
	@PostMapping("/")
	public List<BookInventory> saveData(@RequestBody List<BookInventory> bookInventory){
		return bookInventoryService.saveData(bookInventory);
	}
	
	@GetMapping("/bookinventorylist")
	public List<BookInventory> getAllData(){
		return bookInventoryService.getAllData();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BookInventory> getBookInventoryId (@PathVariable("id") long bookInventoryid){
		return new ResponseEntity<BookInventory>(bookInventoryService.getBookInventoryId(bookInventoryid),HttpStatus.OK);
	}
	
}
