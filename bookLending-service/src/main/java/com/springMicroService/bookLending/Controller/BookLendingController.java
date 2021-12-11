package com.springMicroService.bookLending.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springMicroService.bookLending.Entity.BookLending;
import com.springMicroService.bookLending.Service.BookLendingService;

@RestController
@RequestMapping("/booklending")
public class BookLendingController {
	
	private BookLendingService bookLendingService;

	public BookLendingController(BookLendingService bookLendingService) {
		super();
		this.bookLendingService = bookLendingService;
	}
	
	@PostMapping("/")
	public List<BookLending> saveData(@RequestBody List<BookLending> bookLending){
		return bookLendingService.saveData(bookLending);
	}
	
	@GetMapping("/booklendinglist")
	public List<BookLending> getAllData(){
		return bookLendingService.getBookLendingData();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BookLending> getBookLendingById(@PathVariable("id") long bookLendingId){
		return new ResponseEntity<BookLending>(bookLendingService.getBookLendingById(bookLendingId),HttpStatus.OK);
	}
	
}
