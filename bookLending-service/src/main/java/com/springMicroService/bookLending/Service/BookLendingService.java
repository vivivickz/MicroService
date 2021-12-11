package com.springMicroService.bookLending.Service;

import java.util.List;

import com.springMicroService.bookLending.Entity.BookLending;

public interface BookLendingService {

	List<BookLending> saveData(List<BookLending> bookLending);
	List<BookLending> getBookLendingData();
	BookLending getBookLendingById(long id);
}
