package com.javademo.resttemple_book.repoBook;

import com.javademo.resttemple_book.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoBooks extends CrudRepository<Book,Integer> {
}
