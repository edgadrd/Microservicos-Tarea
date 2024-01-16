package com.nttdata.escuela.bookstore.mapper;

import com.nttdata.escuela.bookstore.model.BookStoreBook;
import com.nttdata.escuela.bookstore.model.BookStoreBookDTO;
import org.springframework.stereotype.Component;

@Component
public class BookStoreBookMapperImpl implements BookStoreBookMapper {
    @Override
    public BookStoreBook fromDTO(BookStoreBookDTO dto) {
        return BookStoreBook.builder()
                .libroId(dto.getLibroId())
                .precio(dto.getPrecio())
                .build();
    }

    @Override
    public BookStoreBookDTO toDTO(BookStoreBook entity) {

        return BookStoreBookDTO.builder()
                .libroId(entity.getLibroId())
                .precio(entity.getPrecio())
                .build();
    }
}
