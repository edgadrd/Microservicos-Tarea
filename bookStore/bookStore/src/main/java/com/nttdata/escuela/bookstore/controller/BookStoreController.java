package com.nttdata.escuela.bookstore.controller;

import com.nttdata.escuela.bookstore.model.BookStoreBookDTO;
import com.nttdata.escuela.bookstore.model.BookStoreBookRequestDTO;
import com.nttdata.escuela.bookstore.model.BookStoreDTO;
import com.nttdata.escuela.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookStoreController {

    private final BookStoreService bookStoreService;

    @Autowired
    public BookStoreController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    @GetMapping
    public List<BookStoreDTO> findAll(){
        return this.bookStoreService.findAllBookStore();
    }

    @GetMapping("/{id}")
    public BookStoreDTO findById(@PathVariable Integer id){
        return this.bookStoreService.findByIdBookStore(id);
    }

    @GetMapping("/{id}/book")
    public List<BookStoreBookDTO> findAllBookStoreBookById(@PathVariable Integer id){
        return this.bookStoreService.findAllBookInBookStore(id);
    }

    @PostMapping
    public void saveBookstore(@RequestBody BookStoreDTO bookStoreDTO){
        this.bookStoreService.saveBookStore(bookStoreDTO);
    }

    @PostMapping("/{id}/book")
    public void saveBookInBookStore(@PathVariable Integer id, @RequestBody BookStoreBookRequestDTO bookRequestDTO){
        this.bookStoreService.saveBookInBookStore(id, bookRequestDTO);
    }

    @PutMapping("/{id}")
    public void updateBookStore(@PathVariable Integer id, @RequestBody BookStoreDTO bookStoreDTO){
        this.bookStoreService.updateBookStore(id, bookStoreDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBookstore(@PathVariable Integer id){
        this.bookStoreService.deleteBookStore(id);
    }

}
