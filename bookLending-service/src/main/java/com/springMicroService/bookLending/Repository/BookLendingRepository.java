package com.springMicroService.bookLending.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springMicroService.bookLending.Entity.BookLending;

@Repository
public interface BookLendingRepository extends JpaRepository<BookLending, Long> {

}
