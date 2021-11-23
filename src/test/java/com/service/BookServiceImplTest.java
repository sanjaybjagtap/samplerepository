package com.service;

import com.config.Application;
import com.entity.Book;
import com.repository.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class BookServiceImplTest {

    @Autowired private BookServiceImpl bookService;
    @Autowired private BookRepository bookRepository;

    @Test
    public void shouldFetchBookData() {
        Book book = new Book();
        book.setId(1L);
        book.setName("My first book");
        bookRepository.save(book);

        List<Book> books = bookService.getBooks();
        Assert.assertEquals(1, books.size());
    }

}
