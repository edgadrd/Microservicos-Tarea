package com.nttdata.escuela.libro.apimodel;

import java.util.List;

public interface BookService {

    List<BookEntity> getAllBooks();

    void saveOrUpdateBook(BookEntity author);

    BookEntity getById(Integer id);

    void deleteBookById(Integer id);

    List<BookEntity> getAllBooksByAuthorId(Integer Book);

    Boolean existBookById(Integer id);
}
