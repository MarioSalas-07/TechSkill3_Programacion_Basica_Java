package com.skill.film_management.techskill3;

import com.skill.film_management.techskill3.Controller.GestorPeliculaController;
import com.skill.film_management.techskill3.Model.Pelicula;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Techskill3Application {

	public static void main(String[] args) {
		GestorPeliculaController gestor = new GestorPeliculaController();

		Pelicula pelicula0 = new Pelicula(1,"La Bestia", true);
		Pelicula pelicula1 = new Pelicula(2,"Mortal Kombat", false);
		Pelicula pelicula2 = new Pelicula(3,"Southpaw", true);
		Pelicula pelicula3 = new Pelicula(4,"Kung Fu Panda", true);
		Pelicula pelicula4 = new Pelicula(5,"Peleador Callejero", false);

		gestor.agregarPelicula(pelicula0);
		gestor.agregarPelicula(pelicula1);
		gestor.agregarPelicula(pelicula2);
		gestor.agregarPelicula(pelicula3);
		gestor.agregarPelicula(pelicula4);

		System.out.println("Lista de películas disponibles:");
		for (Pelicula película : gestor.ObteherPeliculasDisponibles()) {
			System.out.println(película);
		}

		gestor.marcarPeliculaComoDisponible(2);

		System.out.println("Lista de películas no disponibles:");
		for (Pelicula película : gestor.ObtenerPeliculasNoDisponibles()) {
			System.out.println(película);
		}

		gestor.eliminarPelicula(1);

		System.out.println("Lista de todas las películas:");
		for (Pelicula película : gestor.obtenerPeliculas()) {
			System.out.println(película);
		}
	}

}
