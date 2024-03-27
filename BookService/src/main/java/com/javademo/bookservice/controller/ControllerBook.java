package com.javademo.bookservice.controller;

import com.javademo.bookservice.entity.Book.Book;
import com.javademo.bookservice.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api")
public class ControllerBook {
    @Autowired
    Bookservice bookservice;
    @GetMapping("/book")
    public List<Book> getALLBook(){
        return bookservice.getALLBook();
    }
    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return bookservice.addBook(book);
    }
    @GetMapping("/book/{id}")
    public Book finByBookid(@PathVariable Integer id){
        return bookservice.getByBook(id);
    }
}
