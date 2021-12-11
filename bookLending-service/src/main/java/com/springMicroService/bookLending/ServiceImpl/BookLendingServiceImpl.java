package com.springMicroService.bookLending.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springMicroService.bookLending.Entity.BookLending;
import com.springMicroService.bookLending.Exception.ResourceNotFoundException;
import com.springMicroService.bookLending.Repository.BookLendingRepository;
import com.springMicroService.bookLending.Service.BookLendingService;

@Service
public class BookLendingServiceImpl implements BookLendingService{

	private BookLendingRepository bookLendingRepository;

	public BookLendingServiceImpl(BookLendingRepository bookLendingRepository) {
		super();
		this.bookLendingRepository = bookLendingRepository;
	}

	@Override
	public List<BookLending> saveData(List<BookLending> bookLending) {
		return bookLendingRepository.saveAll(bookLending);
	}

	@Override
	public List<BookLending> getBookLendingData() {
		return bookLendingRepository.findAll();
	}

	@Override
	public BookLending getBookLendingById(long id) {
		return bookLendingRepository.findById(id).orElseThrow(()-> 
			new ResourceNotFoundException("BookLending", "ID", id));
	}
	
}
