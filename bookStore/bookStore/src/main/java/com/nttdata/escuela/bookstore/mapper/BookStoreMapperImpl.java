package com.nttdata.escuela.bookstore.mapper;

import com.nttdata.escuela.bookstore.model.BookStore;
import com.nttdata.escuela.bookstore.model.BookStoreDTO;
import org.springframework.stereotype.Component;

@Component
public class BookStoreMapperImpl implements BookStoreMapper {
    @Override
    public BookStore fromDTO(BookStoreDTO dto) {
        return BookStore.builder()
                .id(dto.getId())
                .nombreBazar(dto.getNombreBazar())
                .direccion(dto.getDireccion())
                .build();
    }

    @Override
    public BookStoreDTO toDTO(BookStore entity) {

        return BookStoreDTO.builder()
                .id(entity.getId())
                .nombreBazar(entity.getNombreBazar())
                .direccion(entity.getDireccion())
                .build();
    }
}
