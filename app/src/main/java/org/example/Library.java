package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        if (books.isEmpty()) {
            System.out.println("Keine Bücher vorhanden");
        }
        books.add(book);
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
