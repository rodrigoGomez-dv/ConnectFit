package usuario;

import java.time.LocalDate;

public class UserGym extends Usuario {
	
	private LocalDate fechaNac;
	private double peso;
	private double altura;
	private String alimentacion;
	private String condicionFisica;
	public UserGym(int idUsuario, String nombre, String apellido, String dni, String email, String contrasenia,
			LocalDate fechaNac, double peso, double altura, String alimentacion, String condicionFisica) {
		super(idUsuario, nombre, apellido, dni, email, contrasenia);
		this.fechaNac = fechaNac;
		this.peso = peso;
		this.altura = altura;
		this.alimentacion = alimentacion;
		this.condicionFisica = condicionFisica;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public String getCondicionFisica() {
		return condicionFisica;
	}
	public void setCondicionFisica(String condicionFisica) {
		this.condicionFisica = condicionFisica;
	}
	@Override
	public String toString() {
		return "UserGym [fechaNac=" + fechaNac + ", peso=" + peso + ", altura=" + altura + ", alimentacion="
				+ alimentacion + ", condicionFisica=" + condicionFisica + "]";
	}
	
}
