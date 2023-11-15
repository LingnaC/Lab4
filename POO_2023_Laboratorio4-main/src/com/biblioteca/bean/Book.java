package com.biblioteca.bean;

public class Book extends ResourcesLibrary {

    public Book(String name, String ISBN, double price) {
        super(name, ISBN, "Book", price);
    }

    // Puedes agregar métodos específicos para libros si es necesario
}
