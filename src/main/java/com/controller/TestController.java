package com.controller;

import com.entity.Book;
import com.entity.Customer;
import com.repository.BookRepository;
import com.service.BookServiceImpl;
import com.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    BookServiceImpl bookService;

    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping(value = "/test")
    public String test() {
        return "In test controller";
    }

    @RequestMapping(value = "/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @RequestMapping(value = "/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}
