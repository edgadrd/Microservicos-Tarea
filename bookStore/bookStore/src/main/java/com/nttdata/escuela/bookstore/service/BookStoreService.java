package com.nttdata.escuela.bookstore.service;

import com.nttdata.escuela.bookstore.model.BookStoreBookDTO;
import com.nttdata.escuela.bookstore.model.BookStoreDTO;
import com.nttdata.escuela.bookstore.model.BookStoreBookRequestDTO;


import java.util.List;

public interface BookStoreService{

    List<BookStoreDTO> findAllBookStore();
    void saveBookStore(BookStoreDTO bookStore);

    BookStoreDTO findByIdBookStore(Integer id);

    void updateBookStore(Integer id , BookStoreDTO bookStore);

    void deleteBookStore(Integer id);

    void saveBookInBookStore(Integer idBookStore , BookStoreBookRequestDTO book);
    List<BookStoreBookDTO> findAllBookInBookStore(Integer idBookStore);













}
