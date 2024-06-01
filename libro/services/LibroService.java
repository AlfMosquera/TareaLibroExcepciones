package com.tarea.libro.services;

import java.util.List;

import com.tarea.libro.models.Libro;
public interface LibroService {
    Libro getLibro(int id);
    List<Libro> getLibros();
    Libro nuevoLibro(Libro libro);
}
