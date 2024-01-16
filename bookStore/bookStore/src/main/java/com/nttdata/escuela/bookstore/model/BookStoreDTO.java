package com.nttdata.escuela.bookstore.model;

import lombok.*;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookStoreDTO {
    private Integer id;
    private String nombreBazar;
    private String direccion;
}
