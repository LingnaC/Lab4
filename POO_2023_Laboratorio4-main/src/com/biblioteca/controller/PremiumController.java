package com.biblioteca.controller;

import java.util.ArrayList;

import com.biblioteca.bean.PremiumUser;
import com.biblioteca.bean.ResourcesLibrary;

public class PremiumController {

    private PremiumUser user;

    public PremiumController(String name, String password, String userID) {
        // Crear una instancia de PremiumUser al inicializar el controlador
        this.user = new PremiumUser(name, password, userID, new ArrayList<>(), true);
    }

    public void loginUser() {
        user.login();
        // Lógica de inicio de sesión para PremiumUser
    }

    public void registerUser() {
        user.register();
        // Lógica de registro para PremiumUser
    }

    public void addBookToLoan(ResourcesLibrary book) {
        // Lógica para agregar un libro al préstamo de un usuario premium
        if (user.getLoan().size() < 5) {
            user.getLoan().add(book);
            System.out.println("Libro agregado al préstamo premium.");
        } else {
            System.out.println("Límite de libros alcanzado para usuarios premium.");
        }
    }

    // Otros métodos específicos para el controlador de usuarios premium
}

