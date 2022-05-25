package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Login;

public class Logins {
	
	public void crearLogin(Login login) {
		String usuario = login.getUsuario();
		String contrasena = login.getContrasena();
		
		Conexion.ejecutarUpdate("INSERT INTO logins (usuario, contrasena) VALUES ('"+usuario+"', '"+contrasena+"');");
	}
	
	public ArrayList<Login> recogerLogins(){
		
		// TODO: Hacer la petici�n a BBDD para recoger los usuarios y sus contrasenas//
		
		ArrayList<Login> login = new ArrayList<Login>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM usuario;");
		try {
			while(resultado.next()) {
				String usuario = resultado.getString("usuario");
				String contrasena = resultado.getString("contrasena");
				Logins.add(new Login(usuario, contrasena));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}
	
	private static void add(Login login) {
		
		// TODO Auto-generated method stub //
		
	}

	public void borrarLogin(String usuario, String contrasena) {
		Conexion.ejecutarUpdate("DELETE FROM alumnos WHERE ="+usuario+";"+contrasena);
	}

	public void modificarLogin(Login login) {
		String usuario = login.getUsuario();
		String contrasena = login.getContrasena();
		
		Conexion.ejecutarUpdate("UPDATE login SET nombre='"+usuario+"', '"+contrasena+";");
		
	}
}