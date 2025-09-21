package grupo;

import java.util.List;

import ejercicio.CatalogoEjercicios;
import ejercicio.Ejercicio;
public abstract class GruposMusculares {
	protected String nombreMusculo;

	public GruposMusculares(String nombreMusculo) {
		this.nombreMusculo = nombreMusculo;
	}
	public List<Ejercicio> listarGrupo(CatalogoEjercicios cat){
		return cat.listarPorGrupo(nombreMusculo);
	}
}
