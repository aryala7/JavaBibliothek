package org.example;

import org.example.exceptions.BookAlreadyBorrowedException;
import org.example.exceptions.BookNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Library {

    private final Map<Integer,Book> books = new HashMap<Integer,Book>();

    public void addBook(Book book){
        if (books.containsKey(book.getId())) {
            return;
        }
        books.put(book.getId(), book);
    }
    public Book searchBookByTitle(String title){
        return searchBooksByProperty(Book::getTitle, title);
    }
    public Book searchBookByAuthor(String author){
        return searchBooksByProperty(Book::getAuthor, author);
    }

    public Book searchBooksByProperty(Function<Book,String> propertyExtractor, String value){
        return books.values()
                .stream()
                .filter(book -> propertyExtractor.apply(book).equals(value))
                .findFirst()
                .orElse(null);
    }
    public Book borrowBook(Integer id) throws Exception {
        Book book = books.get(id);
        if (book == null) {
            throw new BookNotFoundException("Book not found");
        }
        if (!book.isBorrowed()) {
            throw new BookAlreadyBorrowedException("Book is not borrowed");
        }
        book.setIsBorrowed(true);
        return book;
    }
}
