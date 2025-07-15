package controllers;

import models.Book;

import java.util.*;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Map<Book, Book> mapaOrdenado = new TreeMap<>();

        for (Book libro : libros) {
            mapaOrdenado.putIfAbsent(libro, libro);
        }
        

        return mapaOrdenado;
    }
}
