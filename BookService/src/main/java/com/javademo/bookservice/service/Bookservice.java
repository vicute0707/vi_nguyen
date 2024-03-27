package com.javademo.bookservice.service;

import com.javademo.bookservice.entity.Book.Book;
import com.javademo.bookservice.repo.RepoBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class Bookservice {
    @Autowired
    RepoBook repoBook;
    public List<Book> getALLBook(){
        List<Book> list = new ArrayList<>();
        repoBook.findAll().iterator().forEachRemaining(list::add);
        return list;

    }
    public Book addBook(@RequestBody Book book){
        return repoBook.save(book);
    }
    public Book getByBook(@PathVariable Integer id){
        Book book= repoBook.findById(id).get();
        return book;
    }
}
