package com.tarea.libro.models;

public class Libro {
    private long id;
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;

    public Libro(long id, String titulo, String autor, String editorial, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial= editorial;
        this.anioPublicacion=anioPublicacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

}

