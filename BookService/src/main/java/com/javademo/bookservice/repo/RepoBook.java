package com.javademo.bookservice.repo;

import com.javademo.bookservice.entity.Book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepoBook extends CrudRepository<Book, Integer> {
}
