package com.adminportal.service.impl;

import com.adminportal.domain.Book;
import com.adminportal.repository.BookRepository;
import com.adminportal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll(){
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book findOne(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void removeOne(long parseLong) {
        bookRepository.deleteById(parseLong);
    }
}
