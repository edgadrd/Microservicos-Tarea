package com.nttdata.escuela.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookStoreBookRequestDTO {
    private Integer idLibro;
    private BigDecimal precio;
}
