package entrenamiento;

import java.util.List;

public class RutinaEntrenamiento {

	private int idRutina;
	private List<String> gruposMusculares;
	public RutinaEntrenamiento(int idRutina, List<String> gruposMusculares) {
		super();
		this.idRutina = idRutina;
		this.gruposMusculares = gruposMusculares;
	}
	public int getIdRutina() {
		return idRutina;
	}
	public void setIdRutina(int idRutina) {
		this.idRutina = idRutina;
	}
	public List<String> getGruposMusculares() {
		return gruposMusculares;
	}
	public void setGruposMusculares(List<String> gruposMusculares) {
		this.gruposMusculares = gruposMusculares;
	}
	@Override
	public String toString() {
		return "RutinaEntrenamiento [idRutina=" + idRutina + ", gruposMusculares=" + gruposMusculares + "]";
	}
	
}
