package com.nttdata.escuela.bookstore.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table("libreria_libro")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookStoreBook {
    @Id
    private Integer id;
    private Integer libroId;
    private Integer libreriaId;
    private BigDecimal precio;
}
