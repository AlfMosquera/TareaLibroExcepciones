package com.tarea.libro.repositories;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tarea.libro.models.Libro;
@Repository
public class LibroRepositoryImpl implements LibroRepository{
    private List<Libro> libros = new ArrayList<>();


    public LibroRepositoryImpl(){
        libros.add(new Libro(11, "Confesiones", "Angeles","Namco",2020));
        libros.add(new Libro(12, "Envidia", "Rodas","Latjap",2021));
        libros.add(new Libro(13, "Avaricia", "Cailo","Namco",2020));
    }

    public Libro getLibro(int id){
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros(){
        System.out.println("Conectado a base de datos POSTGRESQL");
        return libros;
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

    @Override
    public Optional<Libro> findByIdOptional(int id) {
        for(Libro libro: libros){
            if(id == libro.getId()){
                return Optional.of(libro);
            }
        }

        return Optional.empty();
    }
}
