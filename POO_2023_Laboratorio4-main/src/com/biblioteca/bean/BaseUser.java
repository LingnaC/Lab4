package com.biblioteca.bean;

import java.util.ArrayList;

public class BaseUser extends User {

    public BaseUser(String name, String password, String user, ArrayList<ResourcesLibrary> loan) {
        super(name, password, user, loan, false);
    }

    @Override
    public void login() {
        // Implementación específica para el inicio de sesión de BaseUser
        System.out.println("Iniciando sesión como usuario base");
    }

    @Override
    public void register() {
        // Implementación específica para el registro de BaseUser
        System.out.println("Registrando usuario base");
    }
}

