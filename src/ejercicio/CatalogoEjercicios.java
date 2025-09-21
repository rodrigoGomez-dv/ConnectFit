package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CatalogoEjercicios {
	private List<Ejercicio> ejercicios = new ArrayList();
	
	public void agregar(Ejercicio e) {
		ejercicios.add(e);
	}
	public List<Ejercicio> listarEjercicios(){
		return new ArrayList<>(ejercicios);
	}
	
	public List<Ejercicio> listarPorGrupo(String grupo) {
	        List<Ejercicio> res = new ArrayList<>();
	        for (Ejercicio e : ejercicios) {
	            if (e.getGrupo().equalsIgnoreCase(grupo)) {
	                res.add(e);
	            }
	        }
	        return res;
	    }
}
