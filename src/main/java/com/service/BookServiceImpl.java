package com.service;

import com.entity.Book;
import com.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl {

    @Autowired private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
