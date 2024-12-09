package org.example;

import java.util.Scanner;

import static org.example.ConsoleCommands.readUserInput;

public class Book extends Media {
    private String title;
    private String author;
    private String isbn;
    private String status;

    public Book(String title, String author, String isbn, String status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    public static Book readBookFromUser(Scanner scanner) {

        String title = readUserInput(scanner,"Title");
        String author = readUserInput(scanner,"Author");
        String isbn = readUserInput(scanner, "ISBN");
        String status = readUserInput(scanner, "Zustand");

        return new Book(title, author, isbn, status);
    }



    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
