package com.biblioteca.controller;

import com.biblioteca.bean.BaseUser;
import com.biblioteca.bean.ResourcesLibrary;

import java.util.ArrayList;

public class BaseUserController {

    private BaseUser user;

    public BaseUserController(String name, String password, String userID) {
        // Crear una instancia de BaseUser al inicializar el controlador
        this.user = new BaseUser(name, password, userID, new ArrayList<>());
    }

    public void loginUser() {
        user.login();
        // Lógica de inicio de sesión para BaseUser
    }

    public void registerUser() {
        user.register();
        // Lógica de registro para BaseUser
    }

    public void addBookToLoan(ResourcesLibrary book) {
        // Lógica para agregar un libro al préstamo de un usuario base
        user.getLoan().add(book);
        System.out.println("Libro agregado al préstamo.");
    }

    // Otros métodos específicos para el controlador de usuarios base
}
