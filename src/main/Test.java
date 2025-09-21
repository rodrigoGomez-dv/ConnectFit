package main;

import ejercicio.Ejercicio;
import ejercicio.CatalogoEjercicios;
import rutina.RutinaPecho;

public class Test {
	public static void main(String[] args) {

		CatalogoEjercicios catalogo = new CatalogoEjercicios();
		catalogo.agregar(new Ejercicio("Press de Banca", "Pecho", 3, 8, 10, 15));
		catalogo.agregar(new Ejercicio("Aperturas con mancuernas", "Pecho", 3, 10, 12, 15));
		catalogo.agregar(new Ejercicio("Curl Bíceps", "Biceps", 3, 10, 12, 20));
		catalogo.agregar(new Ejercicio("Sentadilla", "Cuadriceps", 4, 5, 8, 80));
		System.out.println("=== Listado de Ejercicios ===");
		for (Ejercicio e : catalogo.listarEjercicios()) {
			System.out.println("- " + e.getNombre() + " | Grupo: " + e.getGrupo() + " | " + e.getSeries() + "x "
					+ e.getRepMin() + "/" + e.getRepMax() + " | Peso recomendado: " + e.getPesoRecomendado() + "kg");
		}
		RutinaPecho rutinaPecho = new RutinaPecho(1, "Rutina Pecho Principiante", catalogo);

		System.out.println("\n=== " + rutinaPecho.getNombreRutina() + " ===");
		for (Ejercicio e : rutinaPecho.getEjercicios()) {
			System.out.println("- " + e.getNombre() + " (" + e.getSeries() + "x" + e.getRepMin() + "/" + e.getRepMax()
					+ ", " + e.getPesoRecomendado() + "kg)");
		}
	}
}
