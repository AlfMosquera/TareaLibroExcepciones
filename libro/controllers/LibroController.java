package com.tarea.libro.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.libro.models.Libro;
import com.tarea.libro.repositories.LibroRepository;
import com.tarea.libro.repositories.LibroRepositoryDemo;
import com.tarea.libro.repositories.LibroRepositoryImpl;
import com.tarea.libro.services.LibroService;
import com.tarea.libro.services.LibroServiceImpl;
import com.tarea.libro.util.ResourceNotFoundException;

@RestController
public class LibroController {
    @Autowired
    private LibroService libroService;
    private LibroRepository libroRepository;


    @Autowired
    public LibroController(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @GetMapping("/Bienvenido")
    public String Hola(){
        return "Tarea pt1";
    }

    @PostMapping("/libros")
    public ResponseEntity<Libro> nuevoLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroService.nuevoLibro(libro);
        return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
    }

    //*@GetMapping("/libros/{id}")
   // public Libro getLibro(@PathVariable int id){
      //  Libro libro = libroService.getLibro(id);
       // return libro;
    //}

    @GetMapping("/libros/{id}")
    public ResponseEntity<?> getLibro(@PathVariable int id){ 
        Optional<Libro> libro = libroRepository.findByIdOptional(id);
        if (libro.isEmpty()) {
            throw new ResourceNotFoundException("El Libro con el id: " + id + " no fue encontrado");
        }else{
            return new ResponseEntity<>(libro.get(), HttpStatus.OK); }
    }

    @GetMapping("/libros")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }
    
}

