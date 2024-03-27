package com.javademo.resttemple_book.controller;

import com.javademo.resttemple_book.entity.Book;
import com.javademo.resttemple_book.service.ServiceBookRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("api")
public class ControllerBooks {
    @Autowired
    ServiceBookRes serviceBookRes;
    @GetMapping("/res")
    List<Book> getAllList(){
        return serviceBookRes.getAllBooks();
    }
    @PostMapping("/res")
    public Book addSev(@RequestBody Book rong){
        return serviceBookRes.addBooks(rong);
    }
}
