package com.javademo.resttemple_book.service;

import com.javademo.resttemple_book.entity.Book;
import com.javademo.resttemple_book.repoBook.RepoBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service

public class ServiceBookRes {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RepoBooks repoBooks;
    public List<Book> getAllBooks(){
            List<Book> list = new ArrayList<>();
            for(Book b : list){
                Book book = restTemplate.getForObject("http://localhost:8080/api/book"+b.getSubId(), Book.class);
                list.add(book);
            }
            repoBooks.findAll().iterator().forEachRemaining(list::add);
            return list;
    }
    public Book addBooks(@RequestBody Book book){
        return repoBooks.save(book);
    }

}
