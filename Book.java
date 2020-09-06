package ru.mirea.pr1;
import java.util.*;
import java.lang.System;

public class Book {
    private int page;
    private String type;

    public Book(int n, String a) {
        page = n;
        type = a;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", type='" + type + '\'' +
                '}';
    }
}