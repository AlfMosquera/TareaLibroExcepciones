package com.tarea.libro.repositories;

import java.util.List;
import java.util.Optional;

import com.tarea.libro.models.Libro;

public interface LibroRepository {
    Libro getLibro(int id);
    List<Libro> getLibros();
    Libro nuevoLibro(Libro libro);
    Optional<Libro> findByIdOptional(int id);
} 
