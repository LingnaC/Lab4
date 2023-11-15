package com.biblioteca.bean;

import java.util.ArrayList;

public class PremiumUser extends User {


    public PremiumUser(String name, String password, String user, ArrayList<ResourcesLibrary> loan, boolean isPremium) {
        super(name, password, user, loan, isPremium);

    }

    @Override
    public void login() {
        System.out.println("Iniciando sesión como usuario premium");

    }

    @Override
    public void register() {
        System.out.println("Registrando usuario premium");

    }
}
