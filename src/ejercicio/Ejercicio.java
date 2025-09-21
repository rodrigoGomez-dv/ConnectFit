package ejercicio;

public class Ejercicio {
	private String nombre;
	private String grupo;
	private int series;
	private int repMin;
	private int repMax;
	private int pesoRecomendado;
	public Ejercicio(String nombre, String grupo, int series, int repMin, int repMax, int pesoRecomendado) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
		this.series = series;
		this.repMin = repMin;
		this.repMax = repMax;
		this.pesoRecomendado = pesoRecomendado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public int getRepMin() {
		return repMin;
	}
	public void setRepMin(int repMin) {
		this.repMin = repMin;
	}
	public int getRepMax() {
		return repMax;
	}
	public void setRepMax(int repMax) {
		this.repMax = repMax;
	}
	public int getPesoRecomendado() {
		return pesoRecomendado;
	}
	public void setPesoRecomendado(int pesoRecomendado) {
		this.pesoRecomendado = pesoRecomendado;
	}
	@Override
	public String toString() {
		return "Ejercicio [nombre=" + nombre + ", grupo=" + grupo + ", series=" + series + ", repMin=" + repMin
				+ ", repMax=" + repMax + ", pesoRecomendado=" + pesoRecomendado + "]";
	}
	
}
