package org.example;

import java.util.Scanner;

import static org.example.ConsoleCommands.readUserInput;

public class Book {

    private int id;
    private String title;
    private String author;
    private String genre;
    private Boolean isBorrowed;

    public Book(String title, String author, String genre, Boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isBorrowed = isBorrowed;

    }

    public static Book readBookFromUser(Scanner scanner) {

        String title = readUserInput(scanner,"Title");
        String author = readUserInput(scanner,"Author");
        String genre = readUserInput(scanner, "ISBN");
//        Boolean isBorrowed = readUserInput(scanner, "");

        return new Book(title, author, genre, true);
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static void printThing(AddableItems item) {
        item.print();
    }
}
