package com.biblioteca.view;

import java.util.Scanner;

public class ConsoleUI {

    private Scanner scanner;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int getMenuChoice() {
        try {
            System.out.print("Seleccione una opción: ");
            return scanner.nextInt();
        } catch (Exception e) {
            // Manejar la excepción si el usuario ingresa algo que no es un número
            scanner.nextLine();  // Limpiar el buffer del scanner
            return -1;  // Indicar opción no válida
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
