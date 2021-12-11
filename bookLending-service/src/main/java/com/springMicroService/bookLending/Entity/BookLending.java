package com.springMicroService.bookLending.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookLending {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookLendingId;
	
	private String bookType;
	private String bookName;
	private Date date;
	public long getBookLendingId() {
		return bookLendingId;
	}
	public void setBookLendingId(long bookLendingId) {
		this.bookLendingId = bookLendingId;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BookLending [bookLendingId=" + bookLendingId + ", bookType=" + bookType + ", bookName=" + bookName
				+ ", date=" + date + "]";
	}
	
	
	
	
	
	

}
