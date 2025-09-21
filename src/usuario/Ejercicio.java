package usuario;

public class Ejercicio {
	private String nombre;
	private int series;
	private int reps;
	private double peso;
	public Ejercicio(String nombre, int series, int reps, double peso) {
		super();
		this.nombre = nombre;
		this.series = series;
		this.reps = reps;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Ejercicio [nombre=" + nombre + ", series=" + series + ", reps=" + reps + ", peso=" + peso + "]";
	}
	
}
