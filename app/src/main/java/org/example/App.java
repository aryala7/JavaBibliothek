/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.Scanner;

import static org.example.Book.readBookFromUser;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var lib = new Library<Media>();
        ConsoleCommands commands = new ConsoleCommands();
        System.out.println("Willkommen in meiner virtuellen Bibliothek");
        System.out.println("Tippen Sie 'help' ein, um die Liste der verfügbaren Befehle anzuschauen");
        boolean running = true;
        while (running) {
            String input = sc.nextLine().trim().toLowerCase();
            switch (input) {
                case "help":
                    commands.showCommands();
                    break;
                case "add":
                    Book newBook = readBookFromUser(sc);
                    lib.addItem(newBook);
                    System.out.println("Buch '" + newBook.getTitle() + "' wurde erfolgreich hinzugefügt!");
                    break;
                case "list":
                    lib.getItems();
                    break;
                case "exit":
                    running = false;
                    break;


            }
        }

        sc.close();


    }
}
