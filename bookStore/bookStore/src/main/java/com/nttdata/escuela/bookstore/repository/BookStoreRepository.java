package com.nttdata.escuela.bookstore.repository;

import com.nttdata.escuela.bookstore.model.BookStore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepository extends CrudRepository <BookStore , Integer> {

}
