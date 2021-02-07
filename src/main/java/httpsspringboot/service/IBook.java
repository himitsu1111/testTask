package httpsspringboot.service;

import httpsspringboot.pojo.Book;

import java.util.List;

public interface IBook {
    List<Book> getBookList();
}
