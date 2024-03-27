package com.javademo.bookservice.entity.Book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_book")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer subId;
    @Column(name = "ten")
    private String name;
    @Column(name = "credit")
    private double credit;

}
