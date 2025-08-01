package models;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Book other) {
        int comparacionTitulo = other.titulo.compareTo(this.titulo); // Descendente
        if (comparacionTitulo != 0) {
            return comparacionTitulo;
        }
        return Integer.compare(this.anio, other.anio); // Ascendente
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return anio == book.anio && Objects.equals(titulo, book.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                '}';
    }
}
