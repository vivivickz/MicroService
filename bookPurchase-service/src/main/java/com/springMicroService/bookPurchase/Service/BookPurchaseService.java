package com.springMicroService.bookPurchase.Service;

import java.util.List;

import com.springMicroService.bookPurchase.Entity.BookPurchase;

public interface BookPurchaseService {

	List<BookPurchase> saveData(List<BookPurchase> bookPurchase);
	List<BookPurchase> getAllData();
	BookPurchase getBookPurchaseId(long id);
}
