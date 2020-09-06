package ru.mirea.pr1;
import java.util.*;
import java.lang.System;

public class Ball {
    private String Colore;
    private String type;

    public Ball(String n, String a) {
        Colore = n;
        type = a;
    }

    public String getColore() {
        return Colore;
    }

    public void setColore(String colore) {
        Colore = colore;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "Colore='" + Colore + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}