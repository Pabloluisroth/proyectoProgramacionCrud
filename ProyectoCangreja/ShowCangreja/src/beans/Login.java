package beans;

public class Login {
	
	String usuario;
	String contrasena;
	
	public Login(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
		public String getUsuario() {
			return usuario;
		}
		public void setNombre(String usuario){
			this.usuario = usuario;
		}
		
		public String getContrasena() {
			return contrasena;
		}
		
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}
}