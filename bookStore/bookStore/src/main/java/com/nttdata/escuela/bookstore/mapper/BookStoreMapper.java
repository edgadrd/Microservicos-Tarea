package com.nttdata.escuela.bookstore.mapper;

import com.nttdata.escuela.bookstore.model.BookStore;
import com.nttdata.escuela.bookstore.model.BookStoreDTO;

public interface BookStoreMapper {

    BookStore fromDTO (BookStoreDTO dto);
    BookStoreDTO toDTO(BookStore entity);

}
