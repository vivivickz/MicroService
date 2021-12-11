package com.springMicroService.bookInventory.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springMicroService.bookInventory.Entity.BookInventory;
import com.springMicroService.bookInventory.Exception.ResourceNotFoundException;
import com.springMicroService.bookInventory.Repository.BookInventoryRepository;
import com.springMicroService.bookInventory.Service.BookInventoryService;

@Service
public class BookInventoryServiceImpl implements BookInventoryService {
	
	private BookInventoryRepository bookInventoryRepository;

	public BookInventoryServiceImpl(BookInventoryRepository bookInventoryRepository) {
		super();
		this.bookInventoryRepository = bookInventoryRepository;
	}

	@Override
	public List<BookInventory> saveData(List<BookInventory> bookInventory) {
		return bookInventoryRepository.saveAll(bookInventory);
	}

	@Override
	public List<BookInventory> getAllData() {
		return bookInventoryRepository.findAll();
	}

	@Override
	public BookInventory getBookInventoryId(long id) {
		return bookInventoryRepository.findById(id).orElseThrow(()-> 
			new ResourceNotFoundException("BookInventory", "Id", id));
	}
	
	
}
