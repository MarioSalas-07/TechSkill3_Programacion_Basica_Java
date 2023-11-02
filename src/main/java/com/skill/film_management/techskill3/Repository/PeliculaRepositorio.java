package com.skill.film_management.techskill3.Repository;

import com.skill.film_management.techskill3.Model.Pelicula;

import java.util.List;

public interface PeliculaRepositorio {
    void agregarPelicula(Pelicula pelicula);
    void eliminarPelicula(int id);
    List<Pelicula> obtenerPeliculas();
    List<Pelicula> ObteherPeliculasDisponibles();
    List<Pelicula> ObtenerPeliculasNoDisponibles();
    void marcarPeliculaComoDisponible(int id);
}
