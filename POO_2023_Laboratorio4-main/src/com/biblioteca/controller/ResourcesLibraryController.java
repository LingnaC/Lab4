package com.biblioteca.controller;

import com.biblioteca.bean.ResourcesLibrary;

import java.util.ArrayList;
import java.util.List;

public class ResourcesLibraryController {

    private List<ResourcesLibrary> availableResources;

    public ResourcesLibraryController() {
        this.availableResources = new ArrayList<>();
    }

    public void addResource(ResourcesLibrary resource) {
        availableResources.add(resource);
        System.out.println("Recurso agregado: " + resource.getName());
    }

    public void removeResource(ResourcesLibrary resource) {
        availableResources.remove(resource);
        System.out.println("Recurso eliminado: " + resource.getName());
    }

    public List<ResourcesLibrary> getAvailableResources() {
        return availableResources;
    }

    // Otros métodos específicos para el controlador de recursos
}

