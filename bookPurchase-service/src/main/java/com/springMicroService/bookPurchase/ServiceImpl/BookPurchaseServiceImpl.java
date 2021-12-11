package com.springMicroService.bookPurchase.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMicroService.bookPurchase.Entity.BookPurchase;
import com.springMicroService.bookPurchase.Exception.ResourceNotFoundException;
import com.springMicroService.bookPurchase.Repository.BookPurchaseRepository;
import com.springMicroService.bookPurchase.Service.BookPurchaseService;

@Service
public class BookPurchaseServiceImpl implements BookPurchaseService {
	
	@Autowired
	private BookPurchaseRepository bookPurchaseRepository;

	public BookPurchaseServiceImpl(BookPurchaseRepository bookPurchaseRepository) {
		super();
		this.bookPurchaseRepository = bookPurchaseRepository;
	}

	@Override
	public List<BookPurchase> saveData(List<BookPurchase> bookPurchase) {
		return bookPurchaseRepository.saveAll(bookPurchase);
	}

	@Override
	public List<BookPurchase> getAllData() {
		return bookPurchaseRepository.findAll();
	}

	@Override
	public BookPurchase getBookPurchaseId(long id) {
		return bookPurchaseRepository.findById(id).orElseThrow(()-> 
			new ResourceNotFoundException("BookPurchase","Id" , id));
	}
	
}
