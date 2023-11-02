package com.skill.film_management.techskill3.Controller;

import com.skill.film_management.techskill3.Model.Pelicula;
import com.skill.film_management.techskill3.Repository.PeliculaRepositorio;

import java.util.ArrayList;
import java.util.List;

public class GestorPeliculaController implements PeliculaRepositorio {
    private List<Pelicula> películas = new ArrayList<>();

    public void agregarPelicula(Pelicula film){
        películas.add(film);
    }

    public void eliminarPelicula(int id) {
        películas.removeIf(p -> p.getId() == id);
    }

    public List<Pelicula> obtenerPeliculas() {
        return películas;
    }

    public List<Pelicula> ObteherPeliculasDisponibles() {
        List<Pelicula> disponible = new ArrayList<>();
        for (Pelicula pelicula : películas) {
            if (pelicula.isDisponible()) {
                disponible.add(pelicula);
            }
        }
        return disponible;
    }

    public List<Pelicula> ObtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula película : películas) {
            if (!película.isDisponible()) {
                noDisponibles.add(película);
            }
        }
        return noDisponibles;
    }

    public void marcarPeliculaComoDisponible(int id) {
        for (Pelicula película : películas) {
            if (película.getId() == id) {
                película.setDisponible(true);
                break;
            }
        }
    }
}
