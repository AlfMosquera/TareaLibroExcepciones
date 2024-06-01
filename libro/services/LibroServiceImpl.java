package com.tarea.libro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.libro.models.Libro;
import com.tarea.libro.repositories.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro getLibro(int id) {
        return libroRepository.getLibro(id);
    }

    @Override
    public List<Libro> getLibros() {
        return libroRepository.getLibros();
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        return libroRepository.nuevoLibro(libro);
    }

}
