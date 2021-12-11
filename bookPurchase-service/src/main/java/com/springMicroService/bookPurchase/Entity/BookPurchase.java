package com.springMicroService.bookPurchase.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookPurchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookPurchaseId;
	
	private double cost;
	private String bookName;
	public long getBookPurchaseId() {
		return bookPurchaseId;
	}
	public void setBookPurchaseId(long bookPurchaseId) {
		this.bookPurchaseId = bookPurchaseId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "BookPurchase [bookPurchaseId=" + bookPurchaseId + ", cost=" + cost + ", bookName=" + bookName + "]";
	}
	
	
	
}
