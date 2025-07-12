package com.example.library.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.library.Model.Book;

@Service
public class BookService {
    
    private final Map< Integer, Book> bookCatalog = new HashMap<>();
    private int idCounter = 1;

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookCatalog.values());
    }

    public Book getBookById(int id) {
        return bookCatalog.get(id);
    }

    public Book addBook(Book book) {
        book.setId(idCounter++);
        bookCatalog.put(book.getId(), book);
        return book;
    }

    public boolean deleteBook(int id) {
        return bookCatalog.remove(id) != null;
    }

    public boolean updateAvailability(int id, boolean available) {
        Book book = bookCatalog.get(id);
        if (book != null) {
            book.setAvailable(available);
            return true;
        }
        return false;
    }
}

