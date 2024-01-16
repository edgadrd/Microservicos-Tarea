package com.nttdata.escuela.bookstore.service;

import com.nttdata.escuela.bookstore.client.BookRestClient;
import com.nttdata.escuela.bookstore.mapper.BookStoreBookMapper;
import com.nttdata.escuela.bookstore.mapper.BookStoreMapper;
import com.nttdata.escuela.bookstore.model.BookStoreBook;
import com.nttdata.escuela.bookstore.model.BookStoreBookDTO;
import com.nttdata.escuela.bookstore.model.BookStoreDTO;
import com.nttdata.escuela.bookstore.model.BookStoreBookRequestDTO;
import com.nttdata.escuela.bookstore.repository.BookStoreBookRepository;
import com.nttdata.escuela.bookstore.repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    private final BookStoreRepository bookStoreRepository;
    private final BookStoreBookRepository bookStoreBookRepository;
    private final BookStoreMapper bookStoreMapper;
    private final BookStoreBookMapper bookStoreBookMapper;
    private final BookRestClient bookRestClient;

    @Autowired
    public BookStoreServiceImpl(BookStoreRepository bookStoreRepository, BookStoreBookRepository bookStoreBookRepository, BookStoreMapper bookStoreMapper, BookStoreBookMapper bookStoreBookMapper, BookRestClient bookRestClient) {
        this.bookStoreRepository = bookStoreRepository;
        this.bookStoreBookRepository = bookStoreBookRepository;
        this.bookStoreMapper = bookStoreMapper;
        this.bookStoreBookMapper = bookStoreBookMapper;
        this.bookRestClient = bookRestClient;
    }

    @Override
    public List<BookStoreDTO> findAllBookStore() {

        List<BookStoreDTO> bookStoreDTOList = new ArrayList<>();
        this.bookStoreRepository.findAll().forEach(bookStore -> bookStoreDTOList.add(this.bookStoreMapper.toDTO(bookStore)));
        return bookStoreDTOList;
    }

    @Override
    public void saveBookStore(BookStoreDTO bookStore) {

        this.bookStoreRepository.save(this.bookStoreMapper.fromDTO(bookStore));

    }

    @Override
    public BookStoreDTO findByIdBookStore(Integer id) {
        return this.bookStoreMapper.toDTO(this.bookStoreRepository.findById(id).orElse(null));

    }

    @Override
    public void updateBookStore(Integer id, BookStoreDTO bookStore) {
        this.bookStoreRepository.save(this.bookStoreMapper.fromDTO(bookStore));

    }

    @Override
    public void deleteBookStore(Integer id) {
        this.bookStoreRepository.deleteById(id);

    }

    @Override
    public void saveBookInBookStore(Integer idBookStore, BookStoreBookRequestDTO book) {
        boolean exist = this.bookStoreRepository.existsById(idBookStore);
        if(exist){
            boolean existBook = this.bookRestClient.findExistById(book.getIdLibro());
            if(existBook){
                this.bookStoreBookRepository.save(
                        BookStoreBook.builder()
                                .libroId(book.getIdLibro())
                                .libreriaId(idBookStore)
                                .precio(book.getPrecio())
                                .build()
                );
            }
        }

    }

    @Override
    public List<BookStoreBookDTO> findAllBookInBookStore(Integer idBookStore) {
        List<BookStoreBookDTO> bookStoreBookDTOS = new ArrayList<>();
        this.bookStoreBookRepository.findByLibreriaId(idBookStore).forEach(bstore -> bookStoreBookDTOS.add(this.bookStoreBookMapper.toDTO(bstore)));
        return bookStoreBookDTOS;
    }
}
