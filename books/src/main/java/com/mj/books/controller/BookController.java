package com.mj.books.controller;

import com.mj.books.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    List<Book> books;

    public BookController(){
        initializeBooks();
    }

    public void initializeBooks(){
        books = List.of(
                new Book("Author one", "Title one", "tamil"),
                new Book("Author two", "Title two", "english"),
                new Book("Author three", "Title three", "maths"),
                new Book("Author four", "Title four", "science"),
                new Book("Author five", "Title five", "social")
        );
    }

    // @GetMapping() - if we use the annotation just like this, it will map to the root path - http://localhost:8080
    @GetMapping("/api")
    public String firstApi(){
        return "Hello, Mj";
    }

    @GetMapping("/api/books")
    public List<Book> getBooks(){
        return books;
    }

}
