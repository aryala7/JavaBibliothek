package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media & AddableItems> {

    private final List<T> items = new ArrayList<>();


    public void addItem(T book) {
        items.add(book);
    }
    public List<T> getItemsList() {
        return items;
    }
    public void getItems() {

        for (T item : items) {
            System.out.println(item);
        }
    }
}
