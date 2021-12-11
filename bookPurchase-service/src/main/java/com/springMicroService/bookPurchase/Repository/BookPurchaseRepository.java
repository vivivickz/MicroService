package com.springMicroService.bookPurchase.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springMicroService.bookPurchase.Entity.BookPurchase;

@Repository
public interface BookPurchaseRepository extends JpaRepository<BookPurchase, Long>{

}
