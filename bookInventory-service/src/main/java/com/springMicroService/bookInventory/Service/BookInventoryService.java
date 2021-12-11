package com.springMicroService.bookInventory.Service;

import java.util.List;

import com.springMicroService.bookInventory.Entity.BookInventory;

public interface BookInventoryService {
	List<BookInventory> saveData(List<BookInventory> bookInventory);
	List<BookInventory> getAllData();
	BookInventory getBookInventoryId(long id);
}
