package rutina;

import java.util.List;

import ejercicio.CatalogoEjercicios;
import ejercicio.Ejercicio;
import grupo.Pecho;

public class RutinaPecho extends RutinaEntrenamiento {

	public RutinaPecho(int idRutina, String nombreRutina, CatalogoEjercicios cat) {
		super(idRutina, nombreRutina);
	
		Pecho p = new Pecho();
		List<Ejercicio> ejerciciosPecho = p.listarGrupo(cat);
		 if (ejerciciosPecho.isEmpty()) {
	            System.out.println("No hay ejercicios de 'Pecho' en el catálogo.");
	        }
	        agregarEjercicios(ejerciciosPecho);
	}
}
