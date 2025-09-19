package usuario;

public class Admin extends Usuario{

	private String comentario;
	private boolean puedeModerar;
	public Admin(int idUsuario, String nombre, String apellido, String dni, String email, String contrasenia,
			String comentario, boolean puedeModerar) {
		super(idUsuario, nombre, apellido, dni, email, contrasenia);
		this.comentario = comentario;
		this.puedeModerar = puedeModerar;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public boolean isPuedeModerar() {
		return puedeModerar;
	}
	public void setPuedeModerar(boolean puedeModerar) {
		this.puedeModerar = puedeModerar;
	}
	
}
