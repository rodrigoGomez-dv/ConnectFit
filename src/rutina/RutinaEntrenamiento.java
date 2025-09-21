package rutina;

import java.util.ArrayList;
import java.util.List;
import ejercicio.Ejercicio;

public abstract class RutinaEntrenamiento {
	private int idRutina;
	private String nombreRutina;
	private List<Ejercicio> ejercicios = new ArrayList();

	protected RutinaEntrenamiento(int idRutina, String nombreRutina) {
		super();
		this.idRutina = idRutina;
		this.nombreRutina = nombreRutina;
	}

	public void agregarEjercicios(List<Ejercicio> ejs) {
		ejercicios.addAll(ejs);
	}

	public List<Ejercicio> getEjercicios() {
		return new ArrayList<>(ejercicios);
	}

	public int getIdRutina() {
		return idRutina;
	}

	public String getNombreRutina() {
		return nombreRutina;
	}

}
