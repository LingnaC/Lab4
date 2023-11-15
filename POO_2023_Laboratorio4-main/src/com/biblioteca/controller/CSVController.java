package com.biblioteca.controller;

import com.biblioteca.inter.ArchiveInterface;

public class CSVController implements ArchiveInterface {

    @Override
    public void read() {
        // Lógica para leer desde el archivo CSV
        System.out.println("Leyendo desde el archivo CSV...");
    }

    @Override
    public void export() {
        // Lógica para exportar datos a un archivo CSV
        System.out.println("Exportando datos a un archivo CSV...");
    }
}

