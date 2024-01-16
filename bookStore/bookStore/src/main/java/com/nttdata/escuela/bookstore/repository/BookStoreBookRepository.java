package com.nttdata.escuela.bookstore.repository;

import com.nttdata.escuela.bookstore.model.BookStoreBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookStoreBookRepository extends CrudRepository <BookStoreBook , Integer> {
    List<BookStoreBook>findByLibreriaId(Integer id);
}
