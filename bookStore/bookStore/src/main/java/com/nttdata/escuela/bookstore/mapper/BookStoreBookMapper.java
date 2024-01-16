package com.nttdata.escuela.bookstore.mapper;

import com.nttdata.escuela.bookstore.model.BookStore;
import com.nttdata.escuela.bookstore.model.BookStoreBook;
import com.nttdata.escuela.bookstore.model.BookStoreBookDTO;
import com.nttdata.escuela.bookstore.model.BookStoreDTO;

public interface BookStoreBookMapper {
    BookStoreBook fromDTO (BookStoreBookDTO dto);
    BookStoreBookDTO toDTO(BookStoreBook entity);
}
