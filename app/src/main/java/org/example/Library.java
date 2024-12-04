package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> getBooksList() {
        return books;
    }

    public void removeBook(String isbn) {

        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void updateBook(String isbn, Book updatedBook) {
        books.stream().findFirst().ifPresent(book -> {
            if (book.getIsbn().equals(isbn)) {
                book.setIsbn(updatedBook.getIsbn());
                book.setAuthor(updatedBook.getAuthor());
                book.setTitle(updatedBook.getTitle());
                book.setStatus(updatedBook.getStatus());
            }
        });

    }

    public void getBooks() {

        books.forEach((book) -> {
            System.out.println("\n" + book.getTitle() + " " + book.getIsbn());
        });
    }
}
