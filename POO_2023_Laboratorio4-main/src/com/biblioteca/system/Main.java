//Universidad del Valle
//POO-30
//Grupo 2 -VIP
//Lingna Chen - 23173

package com.biblioteca.system;

import com.biblioteca.controller.BaseUserController;
import com.biblioteca.controller.CSVController;
import com.biblioteca.controller.PremiumController;
import com.biblioteca.controller.ResourcesLibraryController;
import com.biblioteca.bean.BaseUser;
import com.biblioteca.bean.PremiumUser;
import com.biblioteca.bean.ResourcesLibrary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ResourcesLibraryController resourcesController = new ResourcesLibraryController();
        CSVController csvController = new CSVController();

        // Agregar algunos recursos
        ResourcesLibrary book1 = new ResourcesLibrary("Libro1", "ISBN1", "Libro", 20.0);
        ResourcesLibrary book2 = new ResourcesLibrary("Libro2", "ISBN2", "Libro", 25.0);

        resourcesController.addResource(book1);
        resourcesController.addResource(book2);

        // Crear controladores de usuarios
        BaseUserController baseUserController = new BaseUserController("UsuarioBase", "password", "base");
        PremiumController premiumController = new PremiumController("UsuarioPremium", "password", "premium");

        // Mostrar opciones de menú
        showMenu(baseUserController, premiumController, resourcesController, csvController);
    }

    private static void showMenu(BaseUserController baseUserController, PremiumController premiumController,
                                  ResourcesLibraryController resourcesController, CSVController csvController) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n==== Menú Principal ====");
            System.out.println("1. Iniciar sesión como usuario base");
            System.out.println("2. Iniciar sesión como usuario premium");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de nextInt()

            switch (option) {
                case 1:
                    baseUserController.loginUser();
                    // Agregar lógica para el menú de usuario base
                    break;

                case 2:
                    premiumController.loginUser();
                    // Agregar lógica para el menú de usuario premium
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (option != 3);
    }
}
