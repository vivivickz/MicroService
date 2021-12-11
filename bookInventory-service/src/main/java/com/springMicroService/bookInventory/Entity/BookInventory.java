package com.springMicroService.bookInventory.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookInventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookInventoryId;
	
	private String bookType;
	private String bookName;
	
	
	public long getBookInventoryId() {
		return bookInventoryId;
	}
	public void setBookInventoryId(long bookInventoryId) {
		this.bookInventoryId = bookInventoryId;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "BookInventory [bookInventoryId=" + bookInventoryId + ", bookType=" + bookType + ", bookName=" + bookName
				+ "]";
	}
	
	
	
	
}
